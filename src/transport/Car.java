package transport;

import java.time.LocalDate;
import java.util.Calendar;


public class Car extends Transport {

    double engineCapacity;
    String transmission;
    private final String body;
    String registerNumber;
    private final int seatsNumber;
    String tyre;
    Key key;
    Insurance insurance;


    public Car(String brand, String model, double engineCapacity, String color, int yearProduction, String countryProduction, String transmission, String body,
               String registerNumber, int seatsNumber, String tyre, Key key, Insurance insurance, int maxSpeed) {
        super(brand, model, yearProduction, countryProduction, color, maxSpeed);

        if (engineCapacity > 0) {
            this.engineCapacity = engineCapacity;
        } else {
            this.engineCapacity = 1.5;
        }

        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "Механическая";
        } else {
            this.transmission = transmission;
        }

        if (body == null || body.isEmpty() || body.isBlank()) {
            this.body = "default";
        } else {
            this.body = body;
        }

        String regex = "[А-Я]\\d\\d\\d[А-Я][А-Я]";
        if (registerNumber == null || registerNumber.isEmpty() || registerNumber.isBlank() || registerNumber.matches(regex) == false) {
            this.registerNumber = "Невернно введен регистрационный номер";
        } else {
            this.registerNumber = registerNumber;
        }

        if (seatsNumber <= 0) {
            this.seatsNumber = 1;
        } else {
            this.seatsNumber = seatsNumber;
        }

        if (tyre == null || tyre.isEmpty() || tyre.isBlank()) {
            this.tyre = "default";
        } else {
            this.tyre = tyre;
        }
        if(key == null) {
            this.key = new Key(false,false);
        } else {
            this.key = key;
        }

        if(insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }

    public static class Key {
        private final boolean remoteStart;
        private final boolean keyLessAccess;

        public Key(boolean remoteStart, boolean keyLessAccess) {
            this.remoteStart = remoteStart;
            this.keyLessAccess = keyLessAccess;
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isKeyLessAccess() {
            return keyLessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate validityPeriod;
        private final int cost;
        private final String number;

        public Insurance(LocalDate validityPeriod, int cost, String number) {
            if (validityPeriod == null) {
                this.validityPeriod = LocalDate.now();
            } else {
                this.validityPeriod = validityPeriod;
            }

            this.cost = cost;

            if (number == null || number.length() < 9) {
                this.number = "Номер страховки некорректный";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 0, "Страховки нет!");
        }

        public void checkInsValidityPeriod() {
            if (validityPeriod.compareTo(LocalDate.now()) < 0 || validityPeriod.compareTo(LocalDate.now()) == 0) {
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }
        }

        public LocalDate getValidityPeriod() {
            return validityPeriod;
        }

        public int getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

    }

    public void changeTyreForSeason(Car car) {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        if (month <= 2 || month == 10 || month == 11) {
            car.setTyre("Зимняя");
        } else {
            car.setTyre("Летняя");
        }
        // Я думаю что зимняя резина всё еще нужна в ноябре а также в марте
    }
    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        if (engineCapacity > 0) {
            this.engineCapacity = engineCapacity;
        } else {
            this.engineCapacity = 1.5;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "Механическая";
        } else {
            this.transmission = transmission;
        }
    }

    public String getBody() {
        return body;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }


    public void setRegisterNumber(String registerNumber) {
        String regex = "[А-Я]\\d\\d\\d[А-Я][А-Я]";
        if (registerNumber == null || registerNumber.isEmpty() || registerNumber.isBlank() || !registerNumber.matches(regex)) {
            this.registerNumber = "Некоректный регистрационный номер";
        } else {
            this.registerNumber = registerNumber;
        }
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public String getTyre() {
        return tyre;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " " + getYearProduction() + " года выпуска, сборка в стране - " + getCountryProduction() + " цвет кузова - " + getColor() + ", объём двигателя "
                + engineCapacity + ", коробка передач - " + transmission + ", тип кузова - " + body + ", регистрационный номер - " + registerNumber + ", количество мест - " + seatsNumber + ", резина - " + tyre
                + " удалённый доступ - " + key.isRemoteStart() + " бесключевой доступ - " + key.isKeyLessAccess() + " срок действия страховки - "
                + insurance.getValidityPeriod() + ", цена страховки - " + insurance.getCost() + ", номер страховки - " + insurance.getNumber() + " Максимальная скорость - " + getMaxSpeed() + ".";
    }
}
