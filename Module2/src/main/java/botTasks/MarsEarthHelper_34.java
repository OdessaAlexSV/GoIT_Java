package Module2.src.main.java.botTasks;

public class MarsEarthHelper_34 {
    public int convertAppleCount(float count) {
        return (int) count;
    }

    public byte countAppleCount(int garden1Count, int garden2Count) {
        return (byte) (garden1Count + garden2Count);
    }

    public static void main(String[] args) {
        MarsEarthHelper_34 helper = new MarsEarthHelper_34();

        //Should be 10
        System.out.println("convertAppleCount(10f) = " + helper.convertAppleCount(10f));

        //Should be 17
        System.out.println("countAppleCount(10, 7) = " + helper.countAppleCount(10, 7));
    }
}

