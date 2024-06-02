import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private Room room;
    private Guest guest;
    private List<Guest> otherGuests;
    private List<Booking> listBooking;

    public BookingManager(Room room, Guest guest, List<Guest> otherGuests, List<Booking> listBooking) {
        this.room = room;
        this.guest = guest;
        this.otherGuests = otherGuests;
        this.listBooking = listBooking;
    }

    public void addBooking(Booking newBooking) {
        listBooking.add(newBooking);
    }

    public Booking getBooking(int index) {
        return listBooking.get(index);
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

    public List<Booking> getListBooking() {
        return listBooking;
    }

    public void setListBooking(List<Booking> listBooking) {
        this.listBooking = listBooking;
    }
}
