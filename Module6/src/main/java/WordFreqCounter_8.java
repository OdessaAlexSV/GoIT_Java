package main.java;

/**
 * Напиши класс WordFreqCounter.
 * В этом классе опиши метод public float countFreq(String phrase, String word).
 * Метод принимает на вход строку phrase и слово word, и возвращает частоту вхождения слова в фразу.
 * Входная фраза phrase состоит из отдельных слов, разделенных пробелами.
 * Гарантируется, что во входной строке есть только слова, разделенные одиночными пробелами, и нет других символов (знаков пунктуации).
 * Программа должна игнорировать регистр букв (слова, состоящие из маленьких и больших букв, считаются одинаковыми).
 */

public class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        float count = 0;
        String[] arr = phrase.trim().toLowerCase().split(" ");
        for (String str : arr) {
            if (str.equals(word.toLowerCase())) {
                count++;
            }
        }
        return count / arr.length;
    }
}

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();
        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));
        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
        //0.1666666716337204
        System.out.println(freqCounter.countFreq("furybinavi hebaqyhig nofiwegalib Vav nuo doyww", "Vav"));
        //0.1666666716337204
        System.out.println(freqCounter.countFreq("ujihtywyhi nodudinuos dyniexr Ze hi zojyga", "Ze"));
    }
}