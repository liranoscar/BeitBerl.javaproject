public class Apartment extends Residential {
    private int rooms = 1;

    public Apartment(String adress, double area, double price, int parkinglots,int rooms) {
        super(adress, area, price, parkinglots);
        setRooms(rooms);
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        if(rooms > 1) {
            this.rooms = rooms;
        }
    }

    public void taxIt() {
        double tax = getPrice() * 0.08;
        System.out.println("Apartment property tax: " + tax);
    }

    public String toString() {
        return "Apartment{" +
                "rooms=" + rooms +
                '}'+ super.toString();
    }
}
