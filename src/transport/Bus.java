package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int yearProduction, String countryProduction, String color, int maxSpeed) {
        super(brand, model, yearProduction, countryProduction, color, maxSpeed);
    }

    public Bus(String brand, String model, int yearProduction, String countryProduction, int maxSpeed) {
        super(brand, model, yearProduction, countryProduction, maxSpeed);
    }
}
