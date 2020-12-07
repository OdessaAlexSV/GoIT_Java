package main.java;

import java.util.Scanner;

public class WordsFeeling {

    public static void main(String[] args) {

        String[] arr = {"anger", "awe", "joy", "love", "grief"};

        Scanner in = new Scanner(System.in);
        System.out.println("Input any sequence of letters: ");
        String phrase = in.nextLine();

        int count = arr.length;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (!(phrase.toLowerCase().contains(Character.toString(arr[i].charAt(j))))) {
                    j = (arr[i].length() - 1);
                    count--;
                    arr[i]="";
                    continue;
                }
            }
        }
        System.out.println("\"" + phrase + "\"  == " + count + " feelings");
        for (String item : arr ){
            System.out.print(item+" ");
        }
    }
}