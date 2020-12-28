package main.java.botChat.seasons;

class Summer extends Season {

    @Override
    public String getName() {
        return "summer";
    }

    @Override
    public boolean isCold() {
        return false;
    }
}
