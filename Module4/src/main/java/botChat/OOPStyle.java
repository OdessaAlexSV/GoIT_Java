package main.java.botChat;

import main.java.botChat.engine.AdvancedXFuelEngine;
import main.java.botChat.engine.Engine;
import main.java.botChat.engine.XFuelEngine;
import main.java.botChat.passengers.Passenger;
import main.java.botChat.passengers.RegularPassenger;
import main.java.botChat.passengers.VIPPassenger;
import main.java.botChat.tanker.MX200Tanker;
import main.java.botChat.tanker.Tanker;
import main.java.botChat.tanker.XFuelTanker;

public class OOPStyle {

    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
        ship.setName("Walker");
        System.out.println(ship.getName()); //Should be Walker

        ship.setName("");
        System.out.println(ship.getName()); //Should be Walker, empty value ignored

        ship.setName("Voyager ".repeat(100));
        System.out.println(ship.getName()); //Should be Walker, too long value ignored


        ship.setSerialNumber("SN506788");
        System.out.println(ship.getSerialNumber()); //Should be SN506788

        ship.setSerialNumber("SN6934063");
        System.out.println(ship.getSerialNumber()); //Should be SN506788

        ship.setSerialNumber("EE123456");
        System.out.println(ship.getSerialNumber()); //Should be SN506788 - old value

        ship.setName("Voyager");
        ship.setSerialNumber("SN506788");

        //--------------------------------------------------------------------------------
        System.out.println("*".repeat(15));
        //--------------------------------------------------------------------------------

        ship.printInfo();

        //--------------------------------------------------------------------------------
        System.out.println("*".repeat(15));
        //--------------------------------------------------------------------------------

        SpaceRocketLauncher launcher = new SpaceRocketLauncher();
        launcher.setBigRocketCount(5);
        launcher.setSmallRocketCount(10);

        System.out.println("Power is " + launcher.getTotalPower());

        launcher.launchBigRocket();
        System.out.println("Big rocket count is " + launcher.getBigRocketCount());

        launcher.launchSmallRocket();
        System.out.println("Small rocket count is " + launcher.getSmallRocketCount());

        System.out.println("Power is " + launcher.getTotalPower());

        //--------------------------------------------------------------------------------
        System.out.println("*".repeat(15));
        //--------------------------------------------------------------------------------

        Engine basicEngine = new Engine();
        System.out.println(basicEngine.getFuelType()); //A500

        Engine xFuelEngine = new XFuelEngine();
        System.out.println(xFuelEngine.getFuelType()); //XFuel

        //--------------------------------------------------------------------------------
        System.out.println("*".repeat(15));
        //--------------------------------------------------------------------------------

        AdvancedXFuelEngine engine = new AdvancedXFuelEngine();
        engine.setPower(1000);
        engine.setSerialNumber("SN504030");
        engine.printInfo(); //Serial number is SN504030, power is 1000

        //--------------------------------------------------------------------------------
        System.out.println("*".repeat(15));
        //--------------------------------------------------------------------------------

        Tanker tanker = new Tanker();
        tanker.setSerialNumber("SN504030");
        tanker.refuel(300);
        System.out.println();
        Tanker tanker1 = new XFuelTanker();
        tanker1.setSerialNumber("SN504030");
        tanker1.refuel(300);
        System.out.println();
        Tanker tanker2 = new MX200Tanker();
        tanker2.setSerialNumber("SN504030");
        tanker2.refuel(300);

        //--------------------------------------------------------------------------------
        System.out.println("*".repeat(15));
        //--------------------------------------------------------------------------------

        Passenger regular = new RegularPassenger();
        System.out.println(regular.getType()); //Regular
        System.out.println(regular.getTicketPrice()); //199

        Passenger vip = new VIPPassenger();
        System.out.println(vip.getType());  //VIP
        System.out.println(vip.getTicketPrice()); //399

        //--------------------------------------------------------------------------------
        System.out.println("*".repeat(15));
        //--------------------------------------------------------------------------------

        LaunchCalculator calculator = new LaunchCalculator();

        int jupiterStarPrice = calculator.calculateTotalPrice(new JupiterStar(), 100);
        System.out.println("JupiterStar price = " + jupiterStarPrice); //700

        int mercuryBeatPrice = calculator.calculateTotalPrice(new MercuryBeat(), 100);
        System.out.println("MercuryBeat price = " + mercuryBeatPrice); //1500

        int sunHeavenPrice = calculator.calculateTotalPrice(new SunHeaven(), 100);
        System.out.println("SunHeaven price = " + sunHeavenPrice); //2000

        //--------------------------------------------------------------------------------
        System.out.println("*".repeat(15));
        //--------------------------------------------------------------------------------

        SpaceshipCalc calc = new SpaceshipCalc();
        System.out.println(calc.calculateAirBalloons(35)); // 350
        System.out.println(calc.calculateBookCount(50)); // 100

        //--------------------------------------------------------------------------------
        System.out.println("*".repeat(15));
        //--------------------------------------------------------------------------------

        System.out.println(SpaceUtils.PLANET_COUNT); // выводит в консоль 8
        System.out.println(SpaceUtils.pluralPlanets(1)); // выводит в консоль 1 planet
        System.out.println(SpaceUtils.pluralPlanets(5)); // выводит в консоль 5 planets
        System.out.println(SpaceUtils.generateStartMessage("Earthkeeper", "20:40")); // выводит в консоль Ship Earthkeeper start at 20:40.

    }

}
