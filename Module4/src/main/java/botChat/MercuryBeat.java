package main.java.botChat;

class MercuryBeat extends Spaceport {
    @Override
    public int calculateTotalPrice(int passengerCount) {
        return 15 * passengerCount;
    }
}
