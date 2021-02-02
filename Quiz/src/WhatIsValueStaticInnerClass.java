public class WhatIsValueStaticInnerClass {
    static int k = 0;

    public static void main(String[] args) {
        new WhatIsValueStaticInnerClass().new Inner().method();
    }

    class Inner {
        // static int p = 1;
         int p = 1;
        //static final int p = 1;

        public void method() {
            System.out.println(k);
            System.out.println(p);
        }
    }
}
