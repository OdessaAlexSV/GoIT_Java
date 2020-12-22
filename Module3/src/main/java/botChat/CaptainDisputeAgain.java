package main.java.botChat;

public class CaptainDisputeAgain {

    public int findMin(int[] triple) {
        int min = triple[0] < triple[1] ? triple[0] : triple[1];
        return min < triple[2] ? min : triple[2];
    }

    public static void main(String[] args) {

        CaptainDisputeAgain dispute = new CaptainDisputeAgain();
        System.out.println(dispute.findMin(new int[] {1, 10, 3}));
        System.out.println(dispute.findMin(new int[] {50, 4, 100}));
        System.out.println(dispute.findMin(new int[] {666, 454, 38}));
    }
}
