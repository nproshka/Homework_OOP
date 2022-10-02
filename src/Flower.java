import java.util.Objects;

public class Flower {
    private String nameFlower;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String nameFlower, String flowerColor, String country, double cost, int lifeSpan) {
        this.nameFlower = nameFlower;

        if(flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }

        if(country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }

        if(cost >= 0) {
            this.cost = cost;
        } else {
            this.cost = 1.0;
        }

        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }

    }
    public Flower(String nameFlower, String flowerColor, String country, double cost) {
        this.nameFlower = nameFlower;

        if(flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }

        if(country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }

        if(cost >= 0) {
            this.cost = cost;
        } else {
            this.cost = 1.0;
        }

            this.lifeSpan = 3;
        }


    @Override
    public String toString() {
        return nameFlower + " из страны " + country + ", стоимость одной штуки - " + cost + " рублей, срок стояния - " + lifeSpan + " дней.";
    }
}