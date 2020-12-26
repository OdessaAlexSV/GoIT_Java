package main.java.botChat;

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

    }

}
