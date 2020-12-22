package main.java.botChat;

import java.util.Arrays;
import java.util.Scanner;

public class SaveStarShip_15 {

    public int calculateDistance(int distance) {
        if (distance > 0) {
            return distance;
        }
        return Math.abs(distance);
    }

    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[]{"Maux", "Reux", "Piax"};
        } else {
            if (galaxy.equals("Milkyway")) {
                return new String[]{"Earth", "Mars", "Jupiter"};
            } else {
                if (galaxy.equals("DangerBanger")) {
                    return new String[]{"Fobius", "Demius"};
                }
                return new String[0];
            }
        }
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth < 45677) {
            return "Earth";
        } else {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        int price = 50;

        if (fuel.equals("STAR100")) {
            price = 70;
        } else if (fuel.equals("STAR500")) {
            price = 120;
        } else if (fuel.equals("STAR1000")) {
            price = 200;
        }

        return count * price;
    }

    public int roundSpeed(int speed) {

        //(int)(Math.round( speed / 10.0) * 10)

        int firstDigit = speed / 10;
        int lastDigit = speed % 10;

        if (lastDigit >= 5) {
            firstDigit++;
        }

        return firstDigit * 10;
    }

    public int calculateNeededFuel(int distance) {
        if (distance <= 20) {
            return 1000;
        }

        int extraDistance = distance - 1000;
        return 1000 + extraDistance * 5;
    }

    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st number:");
        int a = scanner.nextInt();
        System.out.println("Input 2nd number:");
        int b = scanner.nextInt();
        System.out.println("Input 3rd number:");
        int c = scanner.nextInt();
        scanner.close();

        float maxPower = Math.max(Math.max(a, b), c);

        if (maxPower < 10) {
            maxPower = (maxPower * 0.7f);
        } else {
            if (maxPower <= 100) {
                maxPower = (maxPower * 1.2f);
            } else {
                maxPower = (maxPower * 2.1f);
            }
        }
        System.out.println(maxPower);
    }

    public String getMyPrizes(int ticket) {
        String prize = "";

        if (ticket % 10 == 0) {
            prize += "crystall ";
        }
        if (ticket % 10 == 7) {
            prize += "chip ";
        }
        if (ticket > 200) {
            prize += "coin ";
        }

        return prize.strip();
    }

    public boolean isHangarOk(int side1, int side2, int price) {

        if (side1 >= side2) {
            return (side2 * 2 >= side1) && ((side1 * side2) >= 1500) && (price / (side1 * side2) <= 1000);
        }
            return (side1 * 2 >= side2) && ((side1 * side2) >= 1500) && (price / (side1 * side2) <= 1000);
        }

    public static void main(String[] args) {
        SaveStarShip_15 ship = new SaveStarShip_15();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        //Should be Earth
        System.out.println(ship.choosePlanet(10));

        //Should be 700
        System.out.println(ship.calculateFuelPrice("STAR100", 10));

        //Should be 60
        System.out.println(ship.roundSpeed(55));

        //Should be 1005
        System.out.println(ship.calculateNeededFuel(21));

        //Test stdin data - 1 3 5.
        //Console ouput should be 3.5
        ship.calculateMaxPower();

        //Should be "crystall coin"
        System.out.println(ship.getMyPrizes(17));

        //Should be true
        System.out.println(ship.isHangarOk(43, 43, 636144));
    }
}
