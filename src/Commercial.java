public class Commercial extends Property {
    private boolean storeroom = false;
    private double yield = 0.0;

    public Commercial(String adress, double area, double price, double yield) {
        super(adress, area, price);
        this.yield = yield;
    }

    public Commercial(String adress, double area, double price, double yield, boolean storeroom) {
        this(adress, area, price, yield);
        this.storeroom = storeroom;
    }

    public boolean hasStoreroom() {
        return storeroom;
    }

    public void setStoreroom(boolean storeroom) {
        this.storeroom = storeroom;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        if (yield >= 0) {
            this.yield = yield;
        }
    }

    public void calculateYield() {
        double monthlyProfit = (getPrice() * (yield / 100)) / 12;
        System.out.println("Monthly profit: " + monthlyProfit);
    }

    public void taxIt() {
        double tax = getPrice() * 0.05;
        System.out.println("Commercial property tax: " + tax);
    }

    @Override
    public String toString() {
        return "Commercial{" +
                "storeroom=" + storeroom +
                ", yield=" + yield +
                '}'+ super.toString();
    }
}