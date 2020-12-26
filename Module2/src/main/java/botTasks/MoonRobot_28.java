package main.java.botTasks;

public class MoonRobot_28 {
    public boolean canOvercomeHole(int holeDepth, int batteryPercent) {
        return holeDepth < 34 || batteryPercent > 67;
    }

    //Test output
    public static void main(String[] args) {
        MoonRobot_28 robot = new MoonRobot_28();

        //Should be false
        System.out.println("canOvercomeHole(50, 60) = " + robot.canOvercomeHole(50, 60));
    }
}
