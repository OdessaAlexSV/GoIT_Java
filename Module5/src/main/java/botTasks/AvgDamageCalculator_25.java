package main.java.botTasks;

class AvgDamageCalculator_25 {

    public int calculateAvg(int[] samples) {
        try {
            int sum = 0;
            for (int sampleValue : samples) {
                sum += sampleValue;
            }

            return sum / samples.length;
        } catch (Exception ex) {
            return 0;
        }
    }
}

class AvgDamageCalculatorTest_25 {
    public static void main(String[] args) {
        //5
        System.out.println(new AvgDamageCalculator_25().calculateAvg(new int[]{2, 4, 6, 8}));

        //0
        System.out.println(new AvgDamageCalculator_25().calculateAvg(new int[0]));
    }
}
