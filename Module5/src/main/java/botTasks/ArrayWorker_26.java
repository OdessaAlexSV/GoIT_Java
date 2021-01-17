package main.java.botTasks;

class ArrayWorker_26 {
    public void printElement(int[] array, int index) {
        try {
            System.out.println("value is " + array[index]);
        } catch (Exception ex) {
            System.out.println("wrong index");
        } finally {
            System.out.println("index is " + index);
        }
    }
}

class ArrayWorkerTest_26 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        //value is 1
        //index is 0
        new ArrayWorker_26().printElement(array, 0);

        //wrong index
        //index is 10
        new ArrayWorker_26().printElement(array, 10);
    }
}
