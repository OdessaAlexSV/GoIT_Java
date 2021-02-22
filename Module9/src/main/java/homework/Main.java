package main.java.homework;

public class Main {
    private static final String PHONE_FILE_PATH    = "F:\\Personal\\Devel\\GoIT_Java\\Module9\\src\\resources\\hw\\phonesInitial.txt";
    private static final String PATH_FROM_FILE     = "F:\\Personal\\Devel\\GoIT_Java\\Module9\\src\\resources\\hw\\file.txt";
    private static final String PATH_TO_JSON       = "F:\\Personal\\Devel\\GoIT_Java\\Module9\\src\\resources\\hw\\user.json";
    private static final String PATH_TO_WORDS_FILE = "F:\\Personal\\Devel\\GoIT_Java\\Module9\\src\\resources\\hw\\words.txt";

    public static void main(String[] args) {
        ValidPhoneNumber validPhoneNumber = new ValidPhoneNumber();
        validPhoneNumber.validatorPhoneNumbers(PHONE_FILE_PATH);
        System.out.println("-".repeat(15));

        ToJsonFromFile toJsonFromFile = new ToJsonFromFile();
        toJsonFromFile.readFromFileWriteToJson(PATH_FROM_FILE, PATH_TO_JSON);
        System.out.println("-".repeat(15));

        WordFrequency wordFrequency = new WordFrequency();
        wordFrequency.wordFrequency(PATH_TO_WORDS_FILE);

        new Exercise3().countWords(new Exercise3().readFile(PATH_TO_WORDS_FILE));
    }
}
