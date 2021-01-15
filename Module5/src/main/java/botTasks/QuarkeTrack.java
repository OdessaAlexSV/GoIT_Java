package main.java.botTasks;

import java.util.Objects;

public class QuarkeTrack {
    private int[] arr;

    public QuarkeTrack(int[] lines) {
        this.arr = lines;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof QuarkeTrack)) {
            return false;
        }

        QuarkeTrack track = (QuarkeTrack) obj;
        int sumTrack1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sumTrack1 += arr[i];
        }
        int sumTrack2 = 0;
        for (int i = 0; i < track.arr.length; i++) {
            sumTrack2 += track.arr[i];
        }
        return (sumTrack1 == sumTrack2);
    }

    @Override
    public int hashCode() {
        int sumTrack = 0;
        for (int i = 0; i < arr.length; i++) {
            sumTrack += arr[i];
        }
        return Objects.hash(sumTrack);
    }
}

class QuarkeTrackTest {
    public static void main(String[] args) {
        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 5, 3};
        int[] track4Data = {48, 33, 14};
        int[] track5Data = {82, 6, 4, 1, 0, 1, 0, 1};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);
        QuarkeTrack track4 = new QuarkeTrack(track4Data);
        QuarkeTrack track5 = new QuarkeTrack(track5Data);

        //false
        System.out.println(track1.equals(track2));

        //true
        System.out.println(track1.equals(track3));

        //Can be true or false
        System.out.println(track1.hashCode() == track2.hashCode());

        //true
        System.out.println(track1.hashCode() == track3.hashCode());

        //
        System.out.println(track4.equals(track5));
    }
}