
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Guest> guests = new ArrayList<>();
        guests.add(new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13)));
        guests.add(new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5)));

        System.out.println(guests.get(0).getName() +" "+ guests.get(0).getSurname() +" "+"(" + guests.get(0).getBirthDate() + ")"); // v jiném formátu zapsáno
        System.out.println(guests.get(1).getName() +" "+ guests.get(1).getSurname() +" "+"(" + guests.get(1).getBirthDate() + ")");

        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(1, 1, true, true, 1000));
        rooms.add(new Room(1, 1, true, true, 1000));
        rooms.add(new Room(3, 3, false, true, 2400));

        Booking booking1 = new Booking(LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26),
                 false, rooms.get(0), guests.get(0));
        Booking booking2 = new Booking(LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 1),
                false, rooms.get(2), guests.get(1));

        List<Booking> listBooking = new ArrayList<>();
        listBooking.add(booking1);
        listBooking.add(booking2);

        System.out.println(listBooking+"\n");
    }
}