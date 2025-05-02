import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {

    private Room room;
    private Tarif tarif;
    private Show show;

    public Ticket(Show show, Room room, Tarif tarif) { // Room room zu int room geändert
        this.show = show;
        this.room = room;
        this.tarif = tarif;
    }

    @Override
    public String toString() {
        return ("Ticket\n" + show.toString() +
                "Room: " + room.getRoomNumber() + "\n"
                + "Tarif: " + tarif.getName()+ "\n" +
                "Price: " + isThursday(tarif.getPrice()));
    }

    public double isThursday(double price) {
        if(show.getDate().getDayOfWeek().getValue() == 4) {
            return price * 0.7;
        }
        return price;
    }

}
