package main.java;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<? extends Number> list0 = null;
        List<? extends Integer> list1 = null;

        list0 = list1;
    }
}
