import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private Room room;
    private Guest guest;
    private List<Guest> otherGuests;
    private List<Booking> listBooking = new ArrayList<>();

    public BookingManager(Room room, Guest guest, List<Guest> otherGuests, List<Booking> listBooking) {
        this.room = room;
        this.guest = guest;
        this.otherGuests = otherGuests;
        this.listBooking.addAll(listBooking);
    }

    public void addBooking(Booking newBooking) {
        listBooking.add(newBooking); // Vložení další rezervace do seznamu
    }

    public Booking getBooking(int index) {
        return listBooking.get(index); // Získání rezervace se zadaným indexem ze seznamu
    }

    public Booking getBookings() {
        return getBookings(); // Získání seznamu rezervací - vyměň za getBookinds co má vrátit
    }

    public void clearBookings() {
        listBooking.clear();
    }

    // public boolean isWorkingTypeOfVacation () {
    //     return isWorkingTypeOfVacation();
    //}

    public int getNumberOfWorkingBookings() {
        int numberOfWorkingBookings = 0;
        for (Booking booking : listBooking) {
            if (!booking.getWorkingTypeOfVacation()) {
                numberOfWorkingBookings++;
            }
        }
        return numberOfWorkingBookings;
    }

    public int getNumberOfGuests() {
        int numberOfGuests = 0;
        for (Booking booking : listBooking) { // správně?
        }
        return numberOfGuests;
    }

    public BigDecimal getAverageGuests() {
        BigDecimal averageGuests = BigDecimal.valueOf(0);
        for (Booking booking : listBooking) { //nutno dopsat spočítání průměru
        }
        return averageGuests;
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
        return new ArrayList<>(listBooking); // kopie seznamu rezervací
    }

    public void setListBooking(List<Booking> listBooking) {
        this.listBooking = listBooking;
    }
}
