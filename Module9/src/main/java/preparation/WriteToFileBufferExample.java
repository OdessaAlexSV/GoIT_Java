package main.java.preparation;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFileBufferExample {
    private static final String ABSOLUTE_PATH = "F:\\Personal\\Devel\\GoIT_Java\\Module9\\src\\resources\\out\\file2.txt";

    public static void main(String[] args) {
        File file = new File(ABSOLUTE_PATH);

        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.print("File with name " + file.getName() + " does not exist");
            }
        }

        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file))) {
            String content = "This we have added to a file\nHello World!!";
            bufferedOutputStream.write(content.getBytes());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
