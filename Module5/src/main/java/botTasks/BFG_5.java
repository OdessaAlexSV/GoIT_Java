package main.java.botTasks;

/**
 * Создай класс BFG, у которого будет три поля:
 * int ammo - здесь хранятся патроны, по умолчанию 1000;
 * int damage - здесь хранится наносимый оружием урон, по умолчанию 50;
 * String name - здесь хранится имя оружия, по умолчанию BFG.
 * Создай геттеры для каждого поля.
 *
 * У класса должно быть 4 конструктора:
 * BFG(int ammo, int damage, String name) - задаем значения всем параметрам;
 * BFG(int ammo, int damage) - задаем значения лишь двух параметров, количества патронов и урон, поле name инициализируется значением по умолчанию;
 * BFG(int ammo) - задаем значение лишь количества патронов, урон и имя инициализируется по умолчанию;
 * BFG() - конструктор без параметров, здесь полям ammo, damage и name задаются значения по умолчанию.
 * Также переопредели метод toString(), чтобы он возвращал для класса BFG строку в формате <NAME>, ammo: <AMMO>,
 * damage: <DAMAGE>. Вместо <NAME>, <AMMO>, <DAMAGE> подставляются значения полей name, value и damage.
 */

class BFG {
    private int ammo;
    private int damage;
    private String name;

    public int getAmmo() {
        return ammo;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public BFG(int ammo, int damage, String name) {
        this.ammo = ammo;
        this.damage = damage;
        this.name = name;
    }

    public BFG(int ammo, int damage) {
        this(ammo,damage,"BFG");
    }

    public BFG(int ammo) {
        this(ammo,50,"BFG");
    }

    public BFG() {
        this(1000,50,"BFG");
    }

    @Override
    public String toString() {
        return this.name + ", ammo: " + this.ammo + ", damage: " + this.damage;
    }
}

class BfgTest {
    public static void main(String[] args) {
        //ExtraGun, ammo: 10000, damage: 300
        System.out.println(new BFG(10000, 300, "ExtraGun"));

        //BFG, ammo: 5000, damage: 200
        System.out.println(new BFG(5000, 200));

        //BFG, ammo: 2000, damage: 50
        System.out.println(new BFG(2000));

        //BFG, ammo: 1000, damage: 50
        System.out.println(new BFG());

    }
}