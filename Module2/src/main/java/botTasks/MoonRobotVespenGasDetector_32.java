package Module2.src.main.java.botTasks;

public class MoonRobotVespenGasDetector_32 {

    public boolean isAcidOk(int acidValue, int minAcid, int maxAcid) {
        return (minAcid < acidValue) && (acidValue <= maxAcid);
    }

    public boolean isDensityOk(int density) {
        return ((1000 < density) && (density <= 5000)) || ((10000 < density) && (density <= 15000));
    }

    public boolean isTemperatureOk(boolean cold) {
        return !cold;
    }

    public boolean isGroundOkForVespenGas(int acidValue, int minAcid, int maxAcid, int density, boolean cold) {
        return isAcidOk(acidValue, minAcid, maxAcid) && isDensityOk(density) && isTemperatureOk(cold);
    }

    public static void main(String[] args) {

        MoonRobotVespenGasDetector_32 soil = new MoonRobotVespenGasDetector_32();

        System.out.println(soil.isAcidOk(100, 50, 150));
        System.out.println(soil.isDensityOk(1500));
        System.out.println(soil.isDensityOk(3000));
        System.out.println(soil.isTemperatureOk(false));
        System.out.println(soil.isGroundOkForVespenGas(120, 75, 150, 7500, false));
    }
}

