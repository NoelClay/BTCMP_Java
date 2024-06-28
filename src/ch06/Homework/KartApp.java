package ch06.Homework;

public class KartApp {

    public static void main(String[] args) {
        Kart kart = new Kart("버스트", "Green");

        System.out.println("===== Kart Info =====");
        kart.printKartInfo();

        System.out.println("\n===== RUN =====");
        kart.speedUp();
        kart.speedUp();

        kart.pickupBooster();
        kart.pickupBooster();

        kart.useBooster();
        kart.useBooster();

        kart.speedDown();
        kart.speedDown();
    }
}