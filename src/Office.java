public class Office extends Property {
    public Office(String adress, double area, double price) {
        super(adress, area, price);
    }

    public void taxIt() {
        double tax = getPrice() * 0.05;
        System.out.println("Office property tax: " + tax);
    }

    @Override
    public String toString() {
        return "Office{}" + super.toString();
    }
}
