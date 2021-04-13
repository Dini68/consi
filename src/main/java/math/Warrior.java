package math;

import java.util.Random;

public class Warrior {

    private final String name;
    private int stamina;
    private final double skill;
    private final Point position;

    public Warrior(String name, Point position) {
        this.name = name;
        this.position = position;
        this.stamina = new Random().nextInt(81) + 20;
        this.skill = new  Random().nextDouble();
    }

    public double getSkill() {
        return skill;
    }

    public String getName() {
        return name;
    }

    public void move(Warrior warrior) {
        if (this.position.getX() < warrior.position.getX()) {
            this.position.setX(this.position.getX() + 1);
        }

        if (this.position.getX() > warrior.position.getX()) {
            this.position.setX(this.position.getX() - 1);
        }

        if (this.position.getY() < warrior.position.getY()) {
            this.position.setY(this.position.getY() + 1);
        }

        if (this.position.getY() > warrior.position.getY()) {
            this.position.setY(this.position.getY() - 1);
        }
    }

    public double distance(Warrior warrior) {
        return this.position.distance(warrior.position);
    }

    public void attack(Warrior warrior) {
        if (new Random().nextDouble() < this.skill) {
            warrior.stamina -= new Random().nextInt(3) + 1;
        }
    }

    public boolean isAlive() {
        return stamina > 0;
    }

    public String toString() {
        return name + ": (" + position.getX() + "," + position.getY() + ") " + stamina;
    }
}
