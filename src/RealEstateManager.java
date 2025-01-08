import java.util.*;

public class RealEstateManager {
    private String name;
    private List<Property> properties = new ArrayList<>();

    public RealEstateManager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProperty(Property property) {
        properties.add(property);
    }

    public List<Property> getPropertiesUpToPrice(double maxPrice) throws PriceException {
        if (maxPrice < 0) {
            throw new PriceException("Price cannot be negative.");
        }
        List<Property> result = new ArrayList<>();
        for (Property property : properties) {
            if (property.getPrice() <= maxPrice) {
                result.add(property);
            }
        }
        return result;
    }

    public double getTotalPropertyValue() {
        double total = 0;
        for (Property property : properties) {
            total += property.getPrice();
        }
        return total;
    }

    public void printFinancialReport() {
        for (Property property : properties) {
            property.taxIt();
        }
    }

    public void commercialYield() {
        double totalYield = 0;
        for (Property property : properties) {
            if (property instanceof Commercial) {
                ((Commercial) property).calculateYield();
            }
        }
    }

    public void propertiesByCity(String city) {
        for (Property property : properties) {
            if (property.getAdress().toLowerCase().contains(city.toLowerCase().replace("-", " "))) {
                System.out.println(property);
            }
        }
    }

    public void numberOfCities() {
        Set<String> cities = new HashSet<>();
        for (Property property : properties) {
            String city = property.getAdress().split(",")[0].trim();
            cities.add(city);
        }
        System.out.println("Number of cities: " + cities.size());
        System.out.println("Cities: " + cities);
    }

    @Override
    public String toString() {
        return "RealEstateManager{" +
                "name='" + name + '\'' +
                ", properties=" + properties +
                '}';
    }
}