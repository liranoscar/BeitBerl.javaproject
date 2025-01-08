import java.util.*;
public class Main {
    private static RealEstateManager manager = new RealEstateManager("City Real Estate");

    public static void main(String[] args) {
        initializeProperties();
        startMenu();
    }

    private static void initializeProperties() {
        manager.addProperty(new Apartment("Tel Aviv, Rothschild 1", 120, 2000000, 1, 3));
        manager.addProperty(new Villa("Haifa, Carmel 5", 300, 5000000, 2, 2));
        manager.addProperty(new Vacation("Eilat, Red Sea 12", 80, 1500000, 1, 6));
        manager.addProperty(new Plot("Jerusalem, Old City", 500, 1000000, Plot.TYPE.URBAN));
        manager.addProperty(new Commercial("Ramat Gan, Bursa 10", 200, 3000000, 5.5, true));
        manager.addProperty(new Office("Herzliya, Tech Park", 150, 2500000));
    }

    private static void startMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1 > Search properties by price");
            System.out.println("2 > Financial report");
            System.out.println("3 > Calculate commercial yield");
            System.out.println("4 > Search properties by city");
            System.out.println("5 > Count cities");
            System.out.println("0 > Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 : {
                    System.out.println("Enter maximum price:");
                    double maxPrice = scanner.nextDouble();
                    try {
                        List<Property> properties = manager.getPropertiesUpToPrice(maxPrice);
                        properties.forEach(System.out::println);
                    } catch (PriceException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 : manager.printFinancialReport();
                case 3 : manager.commercialYield();
                case 4 : {
                    System.out.println("Enter city name:");
                    String city = scanner.nextLine();
                    manager.propertiesByCity(city);
                }
                case 5:
                    manager.numberOfCities();
                case 0 : {
                    System.out.println("Goodbye!");
                    return;
                }
                default :
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
