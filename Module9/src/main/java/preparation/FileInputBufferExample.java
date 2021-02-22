package main.java.preparation;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputBufferExample {
    public static void main(String[] args) {
        String absolutePath = "F:\\Personal\\Devel\\GoIT_Java\\Module9\\src\\resources\\file1.txt";

        File file = new File(absolutePath);

        if (!file.exists()) {
            throw new RuntimeException("File with name " + file.getName() + " does not exist");
        }

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(absolutePath)))
        {
            int ch = bufferedInputStream.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = bufferedInputStream.read();
            }
        } catch (IOException e) {
            System.err.print(e.getMessage());
        }
    }
}
