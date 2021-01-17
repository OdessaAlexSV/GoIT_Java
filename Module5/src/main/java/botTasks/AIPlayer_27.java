package main.java.botTasks;

class AIPlayer_27 {
    private int hp;

    public void setHp(int hp) {
        if (hp >= 0 & hp <= 100) {
            this.hp = hp;
        } else {
            throw new IllegalArgumentException();
        }
    }
}

class AIPlayerTest_27 {
    public static void main(String[] args) {
        AIPlayer_27 player = new AIPlayer_27();

        //Ok value
        try {
            player.setHp(50);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }

        //Invalid value
        try {
            player.setHp(-1);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }
    }
}
