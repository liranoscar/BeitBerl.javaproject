public class Villa extends Residential {
    int levels = 1;

    public Villa(String adress, double area, double price, int parkinglots, int levels) {
        super(adress, area, price, parkinglots);
        setLevels(levels);
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        if(levels >= 1) {
            this.levels = levels;
        }
    }

    public void taxIt() {
        double tax = getPrice() * 0.08;
        System.out.println("Villa property tax: " + tax);
    }

    @Override
    public String toString() {
        return "Villa{" +
                "levels=" + levels +
                '}'+ super.toString();
    }
}

