/*
public class WhatIsValueNestedClass {
    int k = 1;

    public static void main(String[] args) {
        Nested.method();
    }

    static class Nested {
        int p = 0;

        public void method() {
            System.out.println(k);
            System.out.println(p);
        }
    }
}
*/
public class WhatIsValueNestedClass {
    static int k = 1;

    public static void main(String[] args) {
        Nested.method();
    }

    static class Nested {
        static int p = 0;

        public static void method() {
            System.out.println(k);
            System.out.println(p);
        }
    }
}
