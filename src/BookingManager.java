import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private Room room;
    private Guest guest;
    private List<Guest> otherGuests;
    private List<BookingManager> listOfBookings = new ArrayList<>();

    public BookingManager(Room room, Guest guest, List<Guest> otherGuests, List<BookingManager> listOfBookings) {
        this.room = room;
        this.guest = guest;
        this.otherGuests = otherGuests;
        this.listOfBookings = listOfBookings;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    public List<BookingManager> getListOfBookings() {
        return listOfBookings;
    }

    public void setListOfBookings(List<BookingManager> listOfBookings) {
        this.listOfBookings = listOfBookings;
    }
}
