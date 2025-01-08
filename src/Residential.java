
public abstract class Residential extends Property {
    private int parkinglots = 0;

    public Residential(String adress, double area, double price, int parkinglots) {
        super(adress, area, price);
        setParkinglots(parkinglots);
    }

    public int getParkinglots() {
        return parkinglots;
    }

    public void setParkinglots(int parkinglots) {
        if (parkinglots > 0) {
            this.parkinglots = parkinglots;
        }
    }

    public void taxIt() {
        double tax = getPrice() * 0.08;
        System.out.println("Residential property tax: " + tax);
    }

    public String toString() {
        return "Residential{" +
                "parkinglots=" + parkinglots +
                '}'+ super.toString();
    }
}

