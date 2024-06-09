
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

        List<Guest> guests = new ArrayList<>(); // Seznam hostů
        guests.add(guest1);
        guests.add(guest2);
            System.out.println("Seznam hostů:");
        for (Guest guest : guests) {
            System.out.println(guest.getName() + " " + guest.getSurname() + " "+"(" + guest.getBirthDate() + ")");
        }

        Room room1 = new Room(1, 1, true, true, 1000);
        Room room2 = new Room(2, 1, true, true, 1000);
        Room room3 = new Room(3, 3, false, true, 2400);

        List<Room> rooms = new ArrayList<>(); // Seznam pokojů
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        System.out.println("\n" + "Seznam pokojů:");
        for (Room room : rooms) {
            System.out.println("Č.:"+" "+room.getRoomNumber()+" "+"Počet lůžek:"+" "+room.getNumberOfBeds()+
                    " "+"Balkón:"+" "+room.isBalcony()+" "+"S výhledem na moře:"+" "+room.isViewOfSea()+" "
                    +"\n" + "Cena:"+" "+room.getPriceOfRoomForNight()+" "+"Kč" + "\n");
        }

        // Přidání rezervací:
        Booking booking1 = new Booking(LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26),
                false, rooms.get(0), List.of(guest1));
        Booking booking2 = new Booking(LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 1),
                false, rooms.get(2), List.of(guest1), List.of(guest2));

        // Seznam rezervací:
        List<Booking> listBookingManager = new ArrayList<>();
        listBookingManager.add(booking1);
        listBookingManager.add(booking2);
        System.out.println("\n" + "Seznam rezervací:");
        for (Booking ignored : listBookingManager) {
            System.out.println(listBookingManager+"\n");
            System.out.println("Příjezd:"+" "); // dopsat
        }
    }

    public static void fillBookings (BookingManager bookingManager) {
        Guest guest3 = new Guest("Karel", "Dvořák", LocalDate.of(1990, 5, 15));
        Guest guest4 = new Guest("Karel", "Dvořák", LocalDate.of(1979, 1, 3));
        Guest guest5 = new Guest("Karolína", "Tmavá", LocalDate.of(1992, 7, 7));

        Room room2 = new Room(2, 1, true, true, 1000);
        Room room3 = new Room(3, 3, false, true, 2400);

        bookingManager.addBooking(new Booking(LocalDate.of(2023,6,1), LocalDate.of(2023, 6, 7),
                true, room3, List.of(guest3)));
        bookingManager.addBooking(new Booking(LocalDate.of(2023,7,18), LocalDate.of(2023, 7, 21),
                false, room2, List.of(guest4)));

        // Přidání dvoudenních rezervací pro Karolínu Tmavou:
        for (int i = 1; i <= 10; i++) {
            LocalDate firstDay = LocalDate.of(2023, 8, i * 2 - 1);
            LocalDate lastDay = firstDay.plusDays(1);
            bookingManager.addBooking(new Booking(firstDay, lastDay, false, room2, List.of(guest5)));
        }

        bookingManager.addBooking(new Booking(LocalDate.of(2023, 8, 1), LocalDate.of(2023, 8, 31),
                false, room3, List.of(guest5)));
    }

    private static void printBookings(List<Booking> listBookingManager) {
        for (Booking ignored : listBookingManager) {
        System.out.println(listBookingManager);
        }
    }
}