package Animals;

import java.util.Objects;

public abstract class Mammal extends Animals {
    private int speed;
    private String typeFood;

    public Mammal(String name, int age, String livingEnvironment, int speed, String typeFood) {
        super(name, age, livingEnvironment);
        setSpeed(speed);
        setTypeFood(typeFood);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed <= 0 ) {
            this.speed = 10;
        } else {
            this.speed = speed;
        }
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        if (typeFood == null || typeFood.isEmpty() || typeFood.isBlank()) {
            this.typeFood = "Пища";
        } else {
            this.typeFood = typeFood;
        }
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void go() {

    }

    public abstract void walk();

    @Override
    public String toString() {
        return getName() + " этому животному " + getAge() + " лет, среда обитания - " + getLivingEnvironment() + ", средняя скорость - " + speed + ", любимая пища - " + typeFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return speed == mammal.speed && typeFood.equals(mammal.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, typeFood);
    }
}
