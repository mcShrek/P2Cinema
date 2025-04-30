import java.util.ArrayList;
import java.util.List;

public class Room {
    private int roomNumber;
    private List<Show> shows;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.shows = new ArrayList<>();
    }

    public void addShow(Show show) {
        shows.add(show);
    }

    public List<Show> getShows() {
        return shows;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String toString() {
        return "Room " + roomNumber;
    }
    public
}