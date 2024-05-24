import java.util.ArrayList;
import java.util.List;

public class ListOfBookings {
    private List<ListOfBookings> listOfBookings = new ArrayList<>();

    public ListOfBookings(List<ListOfBookings> listOfBookings) {
        this.listOfBookings = listOfBookings;
    }

    public List<ListOfBookings> getListOfBookings() {
        return listOfBookings;
    }

    public void setListOfBookings(List<ListOfBookings> listOfBookings) {
        this.listOfBookings = listOfBookings;
    }
}
