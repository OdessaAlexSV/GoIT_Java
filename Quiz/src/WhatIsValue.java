
public class WhatIsValue {
    public static void main(String[] args) {
        final int k = 0;
        method(new Runnable(){
            public void run() {
                System.out.println(k);
            }
        });
    }

    private static void method(Runnable ref) {
        final int k =1;
        ref.run();
    }
}
