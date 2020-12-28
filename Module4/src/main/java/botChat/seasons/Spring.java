package main.java.botChat.seasons;

class Spring extends Season {

    @Override
    public String getName() {
        return "spring";
    }

    @Override
    public boolean isCold() {
        return false;
    }
}

