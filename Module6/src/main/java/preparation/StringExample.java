package main.java.preparation;

import java.util.ArrayList;
import java.util.List;

public class StringExample {
    public static void main(String[] args) {
        // Java
        String language = "Java";
        language.toUpperCase();
        System.out.println(language);
        System.out.println("-".repeat(15));

        // true, true
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);
        equalResult(s1,s2);
        System.out.println("-".repeat(15));

        // false, true
        String s3 = new String ("abc");
        String s4 = "abc";
        System.out.println(s3 == s4);
        equalResult(s3,s4);
        System.out.println("-".repeat(15));

        // false, true
        String s5 = "abc";
        String s6 = new String ("abc");
        System.out.println(s5 == s6);
        equalResult(s5,s6);
        System.out.println("-".repeat(15));

        // true
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);
        System.out.println("-".repeat(15));

        // false
        Integer i3 = 129;
        Integer i4 = 129;
        System.out.println(i3 == i4);
        System.out.println("-".repeat(15));

        // false
        Integer i5 = new Integer(127);
        Integer i6 = 127;
        System.out.println(i5 == i6);
        System.out.println("-".repeat(15));

        // 123, Hello
        List abc = new ArrayList(127);
        abc.add(123);
        abc.add("Hello");
        abc.forEach(System.out::println);
        System.out.println("-".repeat(15));

        // Compiler: successful, RunTime exception - ClassCastException
        /*
        Set set = new TreeSet();
        set.add("Hello");
        set.add(123);
        set.add(123L);
        System.out.println("-".repeat(15));
        */

        // primitive relays to method by value
        String a= "1";
        String b= "2";
        swapString(a, b);
        System.out.println("a = " + a + ", b = " +b);

        System.out.println("-".repeat(15));

        // array relays to method by reference
        String[] array = new String[]{"1","2"};
        swapStringArr(array);
        System.out.println("a = " + array[0] + ", b = " + array[1]);


       // System.out.println("k is " + k);

    }

    int k =1;

    private static void swapString(String x, String y) {
        String tmp = x;
        x = y;
        y= tmp;
    }

    private static String[] swapStringArr(String[] arr) {
        String tmp = arr[0];
        arr[0] = arr[1];
        arr[1]= tmp;
        return arr;
    }

    private static void equalResult(String str, String str1) {
        System.out.println((str.equals(str1)));
    }
}
