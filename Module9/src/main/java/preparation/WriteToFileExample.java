package main.java.preparation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFileExample {
    private final static String ABSOLUTE_PATH = "F:\\Personal\\Devel\\GoIT_Java\\Module9\\src\\resources\\out\\file1.txt";

    public static void main(String[] args) {
        File file = new File(ABSOLUTE_PATH);

        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }

        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            String content = "New text\nHello World!!";
            outputStream.write(content.getBytes());
        } catch (IOException e) {
            System.err.println("EXCEPTION!!!" + e.getMessage());
        }


    }

}
