package main.java.botTasks;

public class GameMenu_20 {

    static abstract class MenuItem {
        abstract String getAction();
    }

    static class Start extends MenuItem {
        @Override
        String getAction() {
            return "start";
        }
    }

    static class Options extends MenuItem {
        @Override
        String getAction() {
            return "options";
        }
    }

    static class Exit extends MenuItem {
        @Override
        String getAction() {
            return "exit";
        }
    }

    public void act(MenuItem item) {
        System.out.println(item.getAction());
    }
}

class GameMenuTest_20 {

    public static void main(String[] args) {
        GameMenu_20 menu = new GameMenu_20();

        //options
        menu.act(new GameMenu_20.Options());

        //start
        menu.act(new GameMenu_20.Start());

        //exit
        menu.act(new GameMenu_20.Exit());
    }

}
