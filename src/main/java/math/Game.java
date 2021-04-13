package math;

public class Game {

    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("Hunor", new Point(1, 1));
        Warrior warrior2 = new Warrior("Dénes", new Point(8, 3));

        System.out.println("Kiindulás: ");
        System.out.println(warrior1.toString());
        System.out.println(warrior1.getSkill());
        System.out.println(warrior2.toString());
        System.out.println(warrior2.getSkill());

        int round = 0;
        boolean ready = true;

        while (warrior1.distance(warrior2) > 0.001) {
            round++;
            System.out.println(round + ". round");
            if (warrior1.distance(warrior2) > 0.001) {
                warrior1.move(warrior2);
                if (warrior1.distance(warrior2) < 0.001) {
                    warrior1.attack(warrior2);
                    ready = false;
                }
            }
            if (warrior2.distance(warrior1) > 0.001) {
                warrior2.move(warrior1);
                if (warrior2.distance(warrior1) < 0.001) {
                    warrior2.attack(warrior1);
                }
                System.out.println(warrior1.toString());
                System.out.println(warrior2.toString());
            }
        }

        if (!ready) {
            warrior2.attack(warrior1);
            System.out.println(warrior1.toString());
            System.out.println(warrior2.toString());
        }


        while (warrior1.isAlive() && warrior2.isAlive()) {
            round++;
            System.out.println(round + ". round");
            if (warrior1.isAlive()) {
                warrior1.attack(warrior2);
            }
            if (warrior2.isAlive()) {
                warrior2.attack(warrior1);
            }
            System.out.println(warrior1.toString());
            System.out.println(warrior2.toString());
        }

        if (warrior1.isAlive()) {
            System.out.println("Winner: " + warrior1.toString());
        }
        else{
            System.out.println("Winner: " + warrior2.toString());
        }
    }
}
