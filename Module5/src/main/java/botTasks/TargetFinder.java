package main.java.botTasks;

import java.util.Arrays;

class TargetFinder {

    public int[] findTarget(int[] aiCoords, int[][] targets) {

        int index = 0;

        int [] arrDistance = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            int distance = (int) Math.round(Math.sqrt(Math.pow((targets[i][0] - aiCoords[0]), 2) + Math.pow((targets[i][1] - aiCoords[1]), 2)));
            arrDistance[i]=distance;
        }

        for (int i = 0; i < arrDistance.length-1; i++) {
            if (arrDistance[i]<arrDistance[i+1]) {
                index = i;
            }
        }

        return targets[index];
    }
}

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}