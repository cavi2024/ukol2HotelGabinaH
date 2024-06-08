
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Guest firstQuest = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest secondQuest = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

        List<Guest> guests = new ArrayList<>();
        guests.add(firstQuest);
        guests.add(secondQuest);
        System.out.println("Seznam hostů:");
        for (Guest guest : guests) {
            System.out.println(guest.getName() + " " + guest.getSurname() + " "+"(" + guest.getBirthDate() + ")");
        }

        Room firstRoom = new Room(1, 1, true, true, 1000);
        Room secondRoom = new Room(1, 1, true, true, 1000);
        Room thirdRoom = new Room(3, 3, false, true, 2400);

        List<Room> rooms = new ArrayList<>();
        rooms.add(firstRoom);
        rooms.add(secondRoom);
        rooms.add(thirdRoom);
        for (Room allRooms : rooms) {
            System.out.println(allRooms.getRoomNumber() + " " + allRooms.getNumberOfBeds() + " " ); //doplnit zbytek
        }

        Booking booking1 = new Booking(LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26),
                false, rooms.get(0), firstQuest);
        Booking booking2 = new Booking(LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 1),
                false, rooms.get(2), firstQuest); //secondQuest);

        List<Booking> listBooking = new ArrayList<>();
        listBooking.add(booking1);
        listBooking.add(booking2);

        System.out.println(listBooking+"\n");
    }
}