package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int yearProduction;
    private final String countryProduction;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int yearProduction, String countryProduction, String color, int maxSpeed) {

        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (yearProduction > 0) {
            this.yearProduction = yearProduction;
        } else {
            this.yearProduction = 2000;
        }

        if (countryProduction == null || countryProduction.isEmpty() || countryProduction.isBlank()) {
            this.countryProduction = "default";
        } else {
            this.countryProduction = countryProduction;
        }

        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if(maxSpeed <= 0) {
            this.maxSpeed = 10;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public Transport(String brand, String model, int yearProduction, String countryProduction, int maxSpeed) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (yearProduction > 0) {
            this.yearProduction = yearProduction;
        } else {
            this.yearProduction = 2000;
        }

        if (countryProduction == null || countryProduction.isEmpty() || countryProduction.isBlank()) {
            this.countryProduction = "default";
        } else {
            this.countryProduction = countryProduction;
        }
        this.color = "Белый";
        if(maxSpeed <= 0) {
            this.maxSpeed = 10;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public abstract void refill();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public String getCountryProduction() {
        return countryProduction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearProduction=" + yearProduction +
                ", countryProduction='" + countryProduction + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
