package canoe;

import java.time.LocalDateTime;

public class RentalMain {

    private CanoeOffice canoeOffice = new CanoeOffice();

    public CanoeOffice getCanoeOffice() {
        return canoeOffice;
    }

    public static void main(String[] args) {

        RentalMain rentalMain = new RentalMain();
        CanoeRental cr1 = new CanoeRental("Kovács", CanoeType.BLUE, LocalDateTime.now().minusMinutes(60));
        rentalMain.canoeOffice.createRental(cr1);
        CanoeRental cr2 = new CanoeRental("Dénes", CanoeType.RED, LocalDateTime.now().minusMinutes(60));
        rentalMain.canoeOffice.createRental(cr2);
        CanoeRental cr3 = new CanoeRental("Hunor", CanoeType.GREEN, LocalDateTime.now().minusMinutes(50));
        rentalMain.canoeOffice.createRental(cr3);
        CanoeRental cr4 = new CanoeRental("Tünde", CanoeType.BLUE, LocalDateTime.now().minusMinutes(105));
        rentalMain.canoeOffice.createRental(cr4);
        System.out.println(rentalMain.getCanoeOffice().countRentals());
        System.out.println(rentalMain.getCanoeOffice().getRentalPriceByName("Kovács", LocalDateTime.now()));
        System.out.println(rentalMain.getCanoeOffice().getRentalPriceByName("Dénes", LocalDateTime.now()));
        System.out.println(rentalMain.getCanoeOffice().getRentalPriceByName("Hunor", LocalDateTime.now()));
        System.out.println(rentalMain.getCanoeOffice().getRentalPriceByName("Tünde", LocalDateTime.now()));
        System.out.println(rentalMain.getCanoeOffice().findRentalByName("Hunor"));
        rentalMain.getCanoeOffice().closeRentalByName("Hunor", LocalDateTime.now());
        rentalMain.getCanoeOffice().closeRentalByName("Dénes", LocalDateTime.now());
        rentalMain.getCanoeOffice().closeRentalByName("Tünde", LocalDateTime.now());

        System.out.println(rentalMain.getCanoeOffice().listClosedRentals());
        System.out.println(rentalMain.getCanoeOffice().listClosedRentals().get(2).calculateRentalSum());
    }

}
