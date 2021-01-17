package main.java.botTasks;

class TotalScore_28 {
    public int sum(int[] scores) {
        int result = 0;
        int index = 0;

        while (index < scores.length) {
            result += scores[index++];
        }

        return result;
    }
}

class TotalScoreTest_28 {
    public static void main(String[] args) {
        int[] score = {10, 20, 100};

        //130
        System.out.println(new TotalScore_28().sum(score));
    }
}
