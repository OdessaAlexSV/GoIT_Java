package main.java.botChat;

public class SpaceShip {
    private String name;
    private String serialNumber;

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setName(String name) {
        if (name.isBlank() || name.length() > 100) {
            return;
        }
        this.name = name;
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber.length() != 8) {
            return;
        }

        if (!serialNumber.startsWith("SN")) {
            return;
        }

        this.serialNumber = serialNumber;
    }

    public void printInfo() {
        System.out.println("Name is "+ getName() + ", serial number is " + getSerialNumber());
    }
}
