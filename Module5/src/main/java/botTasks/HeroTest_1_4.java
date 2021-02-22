package main.java.botTasks;

/**
 * #1
 * Напиши класс для описания главного героя игры - Hero. У этого класса должны быть два поля:
 * поле name строкового типа. В этом поле будет храниться имя главного героя;
 * поле hp типа int. Здесь будет храниться количество оставшихся очков здоровья.
 * В классе Hero также допиши конструктор без параметров, который будет инициализировать поле name значением "Paratrooper", а поле hp - значением 100.
 * Для полей name и hp напиши геттеры, сеттеры писать необязательно.
 * #2
 * Допиши в классе Hero конструктор, который принимает два параметра - имя главного героя, и число его жизней. Задай полям name и hp значения этих параметров.
 * Не удаляй конструктор по умолчанию, он должен работать так же, как и работал раньше.
 * #3
 * Сделай рефакторинг кода. Перепиши конструктор Hero() без параметров так, чтобы он вызывал конструктор Hero(String, int) с параметрами, используя ключевое слово this.
 * В остальном поведение программы не должно измениться.
 * #4
 * Допиши конструктор Hero(String, int) так, чтобы он ограничивал значение поля hp диапазоном от 0 до 200 включительно.
 */

class Hero {
    private static String name;
    private static int hp;

    public Hero(String name, int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            if (hp > 250) {
                this.hp = 200;
            } else {
                this.hp = hp;
            }
        }
        this.name = name;
    }

    public Hero() {
        this("Paratrooper", 100);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}

public class HeroTest_1_4{
    public static void main(String[] args) {
        Hero hero = new Hero();

        //Expect Paratrooper
        System.out.println(hero.getName());

        //Expect 100
        System.out.println(hero.getHp());

        System.out.println(new Hero().getName()); // Paratrooper
        System.out.println(new Hero("Stranger", 50).getName()); // Stranger
        System.out.println(new Hero("Stranger", -10).getHp());  // 0
    }
}
