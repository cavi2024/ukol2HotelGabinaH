import java.util.ArrayList;
import java.util.List;

public class ListOfBookings {
    private Room room;
    private Guest guest;
    private List<Guest> otherGuests;
    private List<ListOfBookings> listOfBookings = new ArrayList<>();

    public ListOfBookings(Room room, Guest guest, List<Guest> otherGuests, List<ListOfBookings> listOfBookings) {
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

    public List<ListOfBookings> getListOfBookings() {
        return listOfBookings;
    }

    public void setListOfBookings(List<ListOfBookings> listOfBookings) {
        this.listOfBookings = listOfBookings;
    }
}
