import java.time.LocalDate;
import java.util.List;

public class Booking {

    private LocalDate firstDay;
    private LocalDate lastDay;
    private Boolean isWorkingTypeOfVacation;
    private Room room;
    private Guest guest;
    private List<Guest> otherGuests;

    public Booking(LocalDate firstDay, LocalDate lastDay, Boolean isWorkingTypeOfVacation, Room room, Guest guest, List<Guest> otherGuests) {
        this.firstDay = firstDay;
        this.lastDay = lastDay;
        this.isWorkingTypeOfVacation = isWorkingTypeOfVacation;
        this.room = room;
        this.guest = guest;
        this.otherGuests = otherGuests;
    }

    public Booking(LocalDate firstDay, LocalDate lastDay, Boolean isWorkingTypeOfVacation, Room room, Guest guest) {
        this.firstDay = firstDay;
        this.lastDay = lastDay;
        this.isWorkingTypeOfVacation = isWorkingTypeOfVacation;
        this.room = room;
        this.guest = guest;
    }

    public LocalDate getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(LocalDate firstDay) {
        this.firstDay = firstDay;
    }

    public LocalDate getLastDay() {
        return lastDay;
    }

    public void setLastDay(LocalDate lastDay) {
        this.lastDay = lastDay;
    }

    public Boolean getWorkingTypeOfVacation() {
        return isWorkingTypeOfVacation;
    }

    public void setWorkingTypeOfVacation(Boolean workingTypeOfVacation) {
        isWorkingTypeOfVacation = workingTypeOfVacation;
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

    @Override
    public String toString() {
        return "Booking{" +
                "firstDay=" + firstDay +
                ", lastDay=" + lastDay +
                ", isWorkingTypeOfVacation=" + isWorkingTypeOfVacation +
                ", room=" + room +
                ", guest=" + guest +
                ", otherGuests=" + otherGuests +
                '}';
    }
}

