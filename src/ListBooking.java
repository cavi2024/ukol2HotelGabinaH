import java.util.ArrayList;
import java.util.List;

public class ListBooking {
    private Room room;
    private Guest guest;
    private List<Guest> otherGuests;
    private List<ListBooking> listBooking = new ArrayList<>();

    public ListBooking(Room room, Guest guest, List<Guest> otherGuests, List<ListBooking> listOfBookings) {
        this.room = room;
        this.guest = guest;
        this.otherGuests = otherGuests;
        this.listBooking = listOfBookings;
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

    public List<ListBooking> getListBooking() {
        return listBooking;
    }

    public void setListBooking(List<ListBooking> listBooking) {
        this.listBooking = listBooking;
    }
}
