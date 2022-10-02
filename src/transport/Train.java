package transport;

public class Train extends Transport {
    private int tripPrice;
    private String startStation;
    private String endStation;
    private int numberTrainCars;

    public Train(String brand, String model, int yearProduction, String countryProduction, String color, int maxSpeed, int tripPrice, String startStation, String endStation, int numberTrainCars) {
        super(brand, model, yearProduction, countryProduction, color, maxSpeed);
        setTripPrice(tripPrice);
        setStartStation(startStation);
        setEndStation(endStation);
        setNumberTrainCars(numberTrainCars);
    }
    public Train(String brand, String model, int yearProduction, String countryProduction, int maxSpeed, int tripPrice, String startStation, String endStation, int numberTrainCars) {
        super(brand, model, yearProduction, countryProduction, maxSpeed);
        setTripPrice(tripPrice);
        setStartStation(startStation);
        setEndStation(endStation);
        setNumberTrainCars(numberTrainCars);
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        if (tripPrice <= 0) {
            this.tripPrice = 100;
        } else {
            this.tripPrice = tripPrice;
        }
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        if (startStation == null || startStation.isEmpty() || startStation.isBlank()) {
            this.startStation = "Некорректная станция";
        } else {
            this.startStation = startStation;
        }
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        if (endStation == null || endStation.isEmpty() || endStation.isBlank()) {
            this.endStation = "Некорректная станция";
        } else {
            this.endStation = endStation;
        }
    }

    public int getNumberTrainCars() {
        return numberTrainCars;
    }

    public void setNumberTrainCars(int numberTrainCars) {
        if (numberTrainCars <= 0) {
            this.numberTrainCars = 1;
        } else {
            this.numberTrainCars = numberTrainCars;
        }
    }

    @Override
    public String toString() {
        return "Поезд " + getBrand() + ", модель " + getModel() + ", " + getYearProduction() + " года выпуска в стране " + getCountryProduction() + ", скорость передвижения " + getMaxSpeed()
                + " км/ч, отходит от станции " + startStation + " и следует до станции " + endStation + ". Цена поездки - " + tripPrice + " рублей, в поезде " + numberTrainCars + " вагонов.";
    }
}
