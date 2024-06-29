import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {

    private List<Booking> listBookingManager = new ArrayList<>();


    public BookingManager(List<Booking> listBookingManager) {
        this.listBookingManager.addAll(listBookingManager);
    }

    public BookingManager() {}


    // Metody přidané z úkolu:
    public List<Booking> getListBookingManager() {
        return new ArrayList<>(listBookingManager); // kopie seznamu rezervací
    }

    public void setListBookingManager(List<Booking> listBookingManager) {
        this.listBookingManager = listBookingManager;
    }

    public void addBooking(Booking newBooking) {
        listBookingManager.add(newBooking); // Vložení další rezervace do seznamu
    }

    public Booking getBooking(int index) {
        return listBookingManager.get(index); // Získání rezervace se zadaným indexem ze seznamu
    }

    public void addList(List<Booking> list) {
        listBookingManager.addAll(list);
    }

    public List<Booking> getBookings() {
        return new ArrayList<>(listBookingManager); // Získání seznamu rezervací -  co má vrátit
    }

    public void clearBookings() {
        listBookingManager.clear();
    }
    // Počet pracovních rezervací:

    public int getNumberOfWorkingBookings() {
        int numberOfWorkingBookings = 0;
        for (Booking booking : listBookingManager) {
            if (!booking.getWorkingTypeOfVacation()) {
                numberOfWorkingBookings++;
            }
        }
        return numberOfWorkingBookings;
    }
    // Spočítání průměrného počtu hostů na rezervaci:

    public BigDecimal getAverageGuests() {
        BigDecimal averageGuests = BigDecimal.valueOf(0);
        BigDecimal sumOfGuests = BigDecimal.valueOf(0);
        for (Booking booking : listBookingManager) {
            sumOfGuests = sumOfGuests.add(BigDecimal.valueOf(booking.getNumberOfGuests()));
        }
        if (listBookingManager.size() > 0) {
            averageGuests = sumOfGuests.divide(BigDecimal.valueOf(listBookingManager.size()));
        }
        return averageGuests;
    }
}
