
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.time.format.DateTimeFormatter;

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
        for (Booking booking : listBookingManager) {
            System.out.println("Příjezd: "+ booking.getFirstDay() + "," +
                    " Odjezd: " + booking.getLastDay() + "," +
                    " Pokoj č.: " + booking.getRoom().getRoomNumber() + "," +
                    " Počet hostů: " + booking.getNumberOfGuests() + "\n");
        }

        BookingManager bookingManager = new BookingManager();
        fillBookings(bookingManager);

        printBookings(bookingManager.getBookings());

        printGuestStatistics(bookingManager);

    }
    // Přidání dalších hostů a rezervací:
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

    // Výpis všech rezervací ve formátu: datumOd až datumDo: jméno hlavního hosta (datum narození)[počet hostů, výhledNaMoře ano/ne] za cena
    private static void printBookings(List<Booking> bookings) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        for (Booking booking : bookings) {
            String fromDate = booking.getFirstDay().format(formatter);
            String toDate = booking.getLastDay().format(formatter);
            String mainGuestName = booking.getGuests().get(0).getName() + " " + booking.getGuests().get(0).getSurname();
            String birthDate = booking.getGuests().get(0).getBirthDate().format(formatter);
            int numberOfGuests = booking.getGuests().size();
            String viewOfSea = booking.getRoom().isViewOfSea() ? "ano" : "ne";
            BigDecimal price = booking.getPrice();


            System.out.println(fromDate + " až " + toDate + ": " + mainGuestName + " (" + birthDate + ") [" + numberOfGuests + ", výhledNaMoře " + viewOfSea + "] za " + price + " Kč");
        }
    }

    // Výpis prvních 8 rezervací do formátu: datumOd až datumDo: jméno hlavního hosta (datum narození)[počet hostů, výhledNaMoře ano/ne] za cena
    public static void printFirst8RecreationalBookings(List<Booking> bookings) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        int count = 0;
        for (Booking booking : bookings) {
            if (!booking.getWorkingTypeOfVacation()) {
                String fromDate = booking.getFirstDay().format(formatter);
                String toDate = booking.getLastDay().format(formatter);
                String mainGuestName = booking.getGuests().getFirst().getName() + " " + booking.getGuests().getFirst().getSurname();
                String birthDate = booking.getGuests().getFirst().getBirthDate().format(formatter);
                int numberOfGuests = booking.getGuests().size();
                String viewOfSea = booking.getRoom().isViewOfSea() ? "ano" : "ne";
                BigDecimal price = booking.getPrice();

                System.out.println(fromDate + " až " + toDate + ": " + mainGuestName + " (" + birthDate + ") [" + numberOfGuests + ", výhledNaMoře " + viewOfSea + "] za " + price + " Kč");

                count++;
                if (count >= 8) {
                    break;
                }
            }
        }
    }

    // metoda statistiky hostů, která vypíše celkový počet rezervací s jedním, dvěma a více hosty:
    private static void printGuestStatistics (BookingManager bookingManager) {
        int oneGuest = 0;
        int twoGuests = 0;
        int moreThanTwoGuests = 0;

        for (Booking booking : bookingManager.getBookings()) {
            int guestCount = booking.getNumberOfGuests();
            if (guestCount == 1) {
                oneGuest++;
            } else if (guestCount == 2) {
                twoGuests++;
            } else {
                moreThanTwoGuests++;
            }
        }

        System.out.println("Celkový počet rezervací s jedním hostem: " + oneGuest);
        System.out.println("Celkový počet rezervací se dvěma hosty: " + twoGuests);
        System.out.println("Celkový počet rezervací s více než dvěma hosty: " + moreThanTwoGuests);
    }
}