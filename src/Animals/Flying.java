package Animals;

public class Flying extends Birds {
    public Flying(String name, int age, String livingEnvironment, String typeMoving) {
        super(name, age, livingEnvironment, typeMoving);
    }

    @Override
    public void hunt() {
        System.out.println("Охочусь");
    }
    @Override
    public void go() {
        System.out.println("Летаю");
    }
    @Override
    public void sleep() {
        System.out.println("Сплю на дереве");
    }
    @Override
    public void eat() {
        System.out.println("Ем червячков");
    }

    public void fly() {
        System.out.println("Я лечу");
    }


}
