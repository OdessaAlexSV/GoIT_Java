package main.java.preparation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputExample {
    static private String absolutePath = "F:\\Personal\\Devel\\GoIT_Java\\Module9\\src\\resources\\file1.txt";

    public static void main(String[] args) {
        File file = new File(absolutePath);

        if (!file.exists()){
            throw new RuntimeException("File with name " + file.getName() + " does not exist");
        }

        try (FileInputStream inputStream = new FileInputStream(absolutePath)) {
            int ch = inputStream.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = inputStream.read();
            }
        } catch (IOException e) {
            System.err.print(e.getMessage());
        }
    }
}
