package Animals;

public class Amphibians extends Animals {
    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
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

    public void hunt() {

    }

    @Override
    public String toString() {
        return getName() + " этой амфибии " + getAge() + " лет, среда обитания - " + getLivingEnvironment();
    }
}
