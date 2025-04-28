import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {

    private Room room;
    private Tarif tarif;
    private Show show;

    public Ticket(Show show, Room room, Tarif tarif) {
        this.show = show;
        this.room = room;
        this.tarif = tarif;
    }
}
