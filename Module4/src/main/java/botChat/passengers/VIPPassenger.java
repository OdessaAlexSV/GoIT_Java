package main.java.botChat.passengers;

public class VIPPassenger extends Passenger {
    @Override
    public String getType() {
        return "VIP";
    }

    @Override
    public int getTicketPrice() {
        return 399;
    }
}
