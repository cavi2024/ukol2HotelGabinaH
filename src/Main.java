
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Guest guest1 = new Guest("Adéla Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan Dvořáček", LocalDate.of(1995, 5, 5));

        List<Guest> guestList = new ArrayList<>();
        guestList.add(guest1);
        guestList.add(guest2);

        System.out.println(guestList.get(0).getNameAndSurname() +" " + "(1993-03-13)"); // tady jsem to obešla, datové formáty se musím doučit
        System.out.println(guestList.get(1).getNameAndSurname() + " " + "(1995-05-05)");

        Room room1 = new Room(1, 1, true, true, 1000 );
        Room room2 = new Room(2, 1, true, true, 1000);
        Room room3 = new Room(3,3, false, true, 2400);

        List<Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

        Booking booking1 = new Booking(LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26),
                           false, 1, "Adéla Malíková");
        Booking booking2 = new Booking(LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 1),
                           false, 3,"Adéla Malíková + Jan Dvořáček");
                           //nevím, jak evidovat jinak 2 hosty v rámci jedné rezervace

        List<Booking> listOfBookings = new ArrayList<>();
        listOfBookings.add(booking1);
        listOfBookings.add(booking2);

        System.out.println(listOfBookings); //tady zřejmě to také není OK
    }
}