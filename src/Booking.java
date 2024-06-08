import java.time.LocalDate;
import java.util.List;

public class Booking {

    private LocalDate firstDay;
    private LocalDate lastDay;
    private Boolean isWorkingTypeOfVacation;
    private Room room;
    private List<Guest> guests;
    private List<Guest> otherGuests;

    public Booking(LocalDate firstDay, LocalDate lastDay, Boolean isWorkingTypeOfVacation, Room room, List<Guest> guests, List<Guest> otherGuests) {
        this.firstDay = firstDay;
        this.lastDay = lastDay;
        this.isWorkingTypeOfVacation = isWorkingTypeOfVacation;
        this.room = room;
        this.guests = guests;
        this.otherGuests = otherGuests;
    }

    public Booking(LocalDate firstDay, LocalDate lastDay, Boolean isWorkingTypeOfVacation, Room room, List<Guest> guests) {
        this.firstDay = firstDay;
        this.lastDay = lastDay;
        this.isWorkingTypeOfVacation = isWorkingTypeOfVacation;
        this.room = room;
        this.guests = guests;
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

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    public int getNumberOfGuests() {
        return guests.size();
    }

    @Override
    public String toString() {
        return "Booking{" +
                "firstDay=" + firstDay +
                ", lastDay=" + lastDay +
                ", isWorkingTypeOfVacation=" + isWorkingTypeOfVacation +
                ", room=" + room +
                ", guest=" + guests +
                ", otherGuests=" + otherGuests +
                '}';
    }
}

