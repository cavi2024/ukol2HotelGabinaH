public class Room {
    private int roomNumber;
    private int numberOfBeds;
    private boolean isBalcony;
    private boolean isViewOfSea;
    private int priceOfRoomForNight;

    public Room(int roomNumber, int numberOfBeds, boolean isBalcony, boolean isViewOfSea, int priceOfRoomForNight) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.isBalcony = isBalcony;
        this.isViewOfSea = isViewOfSea;
        this.priceOfRoomForNight = priceOfRoomForNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isBalcony() {
        return isBalcony;
    }

    public void setBalcony(boolean balcony) {
        isBalcony = balcony;
    }

    public boolean isViewOfSea() {
        return isViewOfSea;
    }

    public void setViewOfSea(boolean viewOfSea) {
        isViewOfSea = viewOfSea;
    }

    public int getPriceOfRoomForNight() {
        return priceOfRoomForNight;
    }

    public void setPriceOfRoomForNight(int priceOfRoomForNight) {
        this.priceOfRoomForNight = priceOfRoomForNight;
    }
}

