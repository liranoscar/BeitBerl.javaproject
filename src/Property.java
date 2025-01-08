public abstract class Property {
    private String adress = "Na,na";
    private double area = 0;
    private double price = 0;

    public Property(String adress, double area, double price) {
        setAdress(adress);
        setArea(area);
        setPrice(price);
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        if (adress == null || adress.equals(" ") || adress.indexOf(',') != -1) {
            return;
        }
        this.adress = adress;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if(area > 0) {
            this.area = area;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
    }

    public abstract void taxIt();

    @Override
    public String toString() {
        return "Property{" +
                "adress='" + adress + '\'' +
                ", area=" + area +
                ", price=" + price +
                '}';
    }
}
