import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private Room room;
    private Guest guest;
    private List<Guest> otherGuests;
    private List<Booking> listBookingManager = new ArrayList<>();
    private Booking booking;

    public BookingManager(Room room, Guest guest, List<Guest> otherGuests, List<Booking> listBookingManager) {
        this.room = room;
        this.guest = guest;
        this.otherGuests = otherGuests;
        this.listBookingManager.addAll(listBookingManager);
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

    public List<Booking> getListBookingManager() {
        return new ArrayList<>(listBookingManager); // kopie seznamu rezervací
    }

    public void setListBookingManager(List<Booking> listBookingManager) {
        this.listBookingManager = listBookingManager;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public void addBooking(Booking newBooking) {
        listBookingManager.add(newBooking); // Vložení další rezervace do seznamu
    }

    public Booking getBooking(int index) {
        return listBookingManager.get(index); // Získání rezervace se zadaným indexem ze seznamu
    }

    public List<Booking> getBookings() {
        return new ArrayList<>(listBookingManager); // Získání seznamu rezervací -  co má vrátit
    }

    public void clearBookings() {
        listBookingManager.clear();
    }

    public int getNumberOfWorkingBookings() {
        int numberOfWorkingBookings = 0;
        for (Booking booking : listBookingManager) {
            if (!booking.getWorkingTypeOfVacation()) {
                numberOfWorkingBookings++;
            }
        }
        return numberOfWorkingBookings;
    }

    public int getNumberOfGuests() {
        int numberOfGuests = 0;
        for (Booking booking : listBookingManager) { // správně?
        }
        return numberOfGuests;
    }

    public BigDecimal getAverageGuests() {
        BigDecimal averageGuests = BigDecimal.valueOf(0);
        for (Booking booking : listBookingManager) { //nutno dopsat spočítání průměru
        }
        return averageGuests;
    }
}
