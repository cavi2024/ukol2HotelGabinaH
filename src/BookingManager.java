import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {

    private List<Booking> listOfBookings = new ArrayList<>();

    public BookingManager(List<Booking> listOfBookings) {
        this.listOfBookings.addAll(listOfBookings);
    }

    public BookingManager() {}

    // Metody přidané z úkolu:
    public List<Booking> getListOfBookings() {
        return new ArrayList<>(listOfBookings); // kopie seznamu rezervací
    }

    public void setListOfBookings(List<Booking> listOfBookings) {
        this.listOfBookings = listOfBookings;
    }

    public void addBooking(Booking newBooking) {
        listOfBookings.add(newBooking); // Vložení další rezervace do seznamu
    }

    public Booking getBooking(int index) {
        return listOfBookings.get(index); // Získání rezervace se zadaným indexem ze seznamu
    }

    public void addList(List<Booking> list) {
        listOfBookings.addAll(list);
    }

    public List<Booking> getBookings() {
        return new ArrayList<>(listOfBookings); // Získání seznamu rezervací -  co má vrátit
    }

    public void clearBookings() {
        listOfBookings.clear();
    }
    // Počet pracovních rezervací:

    public int getNumberOfWorkingBookings() {
        int numberOfWorkingBookings = 0;
        for (Booking booking : listOfBookings) {
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
        for (Booking booking : listOfBookings) {
            sumOfGuests = sumOfGuests.add(BigDecimal.valueOf(booking.getNumberOfGuests()));
        }
        if (listOfBookings.size() > 0) {
            averageGuests = sumOfGuests.divide(BigDecimal.valueOf(listOfBookings.size()));
        }
        return averageGuests;
    }
}
