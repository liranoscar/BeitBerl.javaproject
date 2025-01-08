public class Vacation extends Residential {
    int guests = 1;

    public Vacation(String adress, double area, double price, int parkinglots,int guests) {
        super(adress, area, price, parkinglots);
        setGuests(guests);
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        if (guests >= 1) {
            this.guests = guests;
        }
    }

    @Override
    public void taxIt() {
        double tax = getPrice() * 0.25;
        System.out.println("Vacation property tax: " + tax);
    }

    @Override
    public String toString() {
        return "Vacation{" +
                "guests=" + guests +
                '}'+ super.toString();
    }
}
