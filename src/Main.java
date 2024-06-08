
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
        Room room2 = new Room(1, 1, true, true, 1000);
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

        Booking booking1 = new Booking(LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26),
                false, rooms.get(0), guest1);
        Booking booking2 = new Booking(LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 1),
                false, rooms.get(2), guest1); //secondQuest);

        List<Booking> listBooking = new ArrayList<>();
        listBooking.add(booking1);
        listBooking.add(booking2);

        System.out.println(listBooking+"\n");
    }
}