package Animals;

public class NonFlyingBird extends Birds {

    public NonFlyingBird(String name, int age, String livingEnvironment, String typeMoving) {
        super(name, age, livingEnvironment, typeMoving);
    }

    @Override
    public void hunt() {
        System.out.println("Охочусь");
    }
    @Override
    public void go() {
        System.out.println("Гуляю");
    }
    @Override
    public void sleep() {
        System.out.println("Сплю на дереве");
    }
    @Override
    public void eat() {
        System.out.println("Ем червячков");
    }

    public void walk() {
        System.out.println("Я гуляю");
    }

}
