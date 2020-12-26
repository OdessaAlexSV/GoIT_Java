package main.java.botTasks;

public class MoonRobot_29 {
    public boolean canOvercomeHole(int holeDepth, int batteryPercent) {
        return holeDepth < 34 || batteryPercent > 67;
    }

    public boolean canJumpOverHill(int holeDepth, int batteryPercent) {
        return holeDepth <= 150 && batteryPercent >= 90;
    }

    //Test output
    public static void main(String[] args) {
        MoonRobot_29 robot = new MoonRobot_29();

        //Should be false
        System.out.println("canOvercomeHole(50, 60) = " + robot.canOvercomeHole(50, 60));

        //Should be true
        System.out.println("canJumpOverHill(100, 90) = " + robot.canJumpOverHill(100, 90));
    }
}
