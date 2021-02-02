/*
public class WhatIsValueStatic {

    private int fieldInstance = 0;
    private static int fieldStatic = 0;

    public static void main(String[] args) {
        X.method();
    }

    public static class X {
        public void method() {
            fieldInstance  = 1;
            System.out.println(fieldInstance);
        }
    }
}
*/

public class WhatIsValueStatic {

    private static int fieldInstance = 0;
    private static int fieldStatic = 0;

    public static void main(String[] args) {
        X.method();
    }

    public static class X {
        public static void method() {
            fieldInstance  = 1;
            System.out.println(fieldInstance);
        }
    }
}

