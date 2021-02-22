package main.java.preparation;

import java.io.*;

public class WriterReaderExample {
    private static final String ABSOLUTE_PATH = "F:\\Personal\\Devel\\GoIT_Java\\Module9\\src\\resources\\writer\\WriteAndRead.txt";

    public static void main(String[] args) {
        File file = new File(ABSOLUTE_PATH);
        checkIfFileAvailable(file);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write("Hello World\nHow are you today?");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line = bufferedReader.readLine();
            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            /*
            int ch = bufferedReader.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = bufferedReader.read();
            }
            */
        } catch (IOException e){
            System.err.println(e.getMessage());
        }

    }

    private static void checkIfFileAvailable(File file) {
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println("File with name " + file.getName() + "does not exist");
            }
        }
    }

}
