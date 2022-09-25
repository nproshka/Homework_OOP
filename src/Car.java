import java.util.Objects;

public class Car {

    String brand;
    String model;
    double engineCapacity;
    String color;
    int yearProduction;
    String countryProduction;

    public Car(String brand, String model, double engineCapacity, String color, int yearProduction, String countryProduction) {
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");

        if(engineCapacity > 0){
            this.engineCapacity = engineCapacity;
        } else {
            this.engineCapacity = 1.5;
        }

        this.color = Objects.requireNonNullElse(countryProduction, "Белый");

        if (yearProduction > 0) {
            this.yearProduction = yearProduction;
        } else {
            this.yearProduction = 2000;
        }

        this.countryProduction = Objects.requireNonNullElse(countryProduction, "default");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public String getCountryProduction() {
        return countryProduction;
    }

    public void setCountryProduction(String countryProduction) {
        this.countryProduction = countryProduction;
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + yearProduction + " года выпуска, сборка в стране - " + countryProduction + " цвет кузова - " + color + ", объём двигателя " + engineCapacity;
    }
}
