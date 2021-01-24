package main.java;

/**
 * Напиши класс GooWordStat.
 * У класса должен быть публичный конструктор, принимающий два параметра:
 * word типа String - слово, для которого мы хотим получить статистику;
 * freq типа int - сколько раз искали это слово.
 * Конструктор должен сохранять эти параметры в приватные поля с такими же именами.
 * Для этих полей создай публичные геттеры. Сеттеров не создавай, это иммутабельные классы.
 * Переопредели метод toString(), чтобы он возвращал строку вида Word is [<WORD>], freq is <FREQ>. Вместо <WORD> используй значение поля word.
 * Вместо <FREQ> подставь строку в зависимости от значения поля freq:
 * если поле freq меньше 1000 - подставь строку LOW;
 * если поле freq больше или равно 1000 и меньше 100000 - подставь строку MEDIUM;
 * если поле freq больше или равно 100000 и меньше 10000000 - подставь строку HIGH;
 * если поле freq больше или равно 10000000 - подставь строку EXTRA HIGH.
 */

class GooWordStat {
    private String word;
    private int freq;

    public GooWordStat(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }

    public String getWord() {
        return this.word;
    }

    public int getFreq() {
        return freq;
    }

    @Override
    public String toString() {
        String strFreq = null;
        if (this.getFreq() < 1000) {
            strFreq = "LOW";
        } else if (this.getFreq() >= 1000 && this.getFreq() < 100000) {
            strFreq = "MEDIUM";
        } else if (this.getFreq() >= 100000 && this.getFreq() < 10000000) {
            strFreq = "HIGH";
        } else if (this.getFreq() >= 10000000) {
            strFreq = "EXTRA HIGH";
        }

        return "Word is [" + this.getWord() + "], search freq is " + strFreq;
    }
}

class GooWordStatTest {
    public static void main(String[] args) {
        //Word is [human], search freq is LOW
        System.out.println(new GooWordStat("human", 10));

        //Word is [mars], search freq is MEDIUM
        System.out.println(new GooWordStat("mars", 10000));

        //Word is [space], search freq is HIGH
        System.out.println(new GooWordStat("space", 9965499));

        //Word is [life], search freq is EXTRA HIGH
        System.out.println(new GooWordStat("life", 564785654));
    }
}