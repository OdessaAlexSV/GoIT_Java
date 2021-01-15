package main.java.botTasks;

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

public class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero();

        //Expect Paratrooper
        System.out.println(hero.getName());

        //Expect 100
        System.out.println(hero.getHp());

        System.out.println(new Hero().getName()); // Paratrooper
        System.out.println(new Hero("Stranger", 50).getName()); // Stranger
        System.out.println(new Hero("Stranger", -10).getHp()); // 50
    }
}
