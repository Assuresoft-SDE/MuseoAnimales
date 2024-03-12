import java.util.List;

public class Museum {
    private String name;
    private double ticketPrice;
    List<Exhibition> exhibitionList;

    public Museum(String name, List<Exhibition> exhibitions) {
        this.name = name;
        this.exhibitionList = exhibitions;
    }

    public void buyTicket() {

    }

    public double getTicketPrice() {
        return ticketPrice;
    }
}
