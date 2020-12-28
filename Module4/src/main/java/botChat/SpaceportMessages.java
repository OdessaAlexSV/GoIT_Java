package main.java.botChat;

class SpaceportMessages {

    public static String generateLandingMessage(String shipName, String spaceport, String time) {
        return "Spaceship " + shipName + " landing at " + spaceport + ", time is " + time;
    }
}
