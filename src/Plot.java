public class Plot extends Property {
    enum TYPE {URBAN, AGRICULTURAL, INDUSTRIAL};
    private TYPE type;

    public Plot(String adress, double area, double price, TYPE type) {
        super(adress, area, price);
        this.type = type;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    @Override
    public void taxIt() {
        double taxRate = switch (type) {
            case URBAN ->0.10;
            case INDUSTRIAL -> 0.05;
            case AGRICULTURAL -> 0.02;
        };
        double tax = getPrice() * taxRate;
        System.out.println("Plot property tax: " + tax);
    }

    @Override
    public String toString() {
        return "Plot{" +
                "type=" + type +
                '}'+ super.toString();
    }
}
