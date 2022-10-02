package Animals;

import java.util.Objects;

public abstract class Birds extends Animals {

    private final String typeMoving;

    public Birds(String name, int age, String livingEnvironment, String typeMoving) {
        super(name, age, livingEnvironment);
        if (typeMoving == null || typeMoving.isEmpty() || typeMoving.isBlank()) {
            this.typeMoving = "Летающий";
        } else {
            this.typeMoving = typeMoving;
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
    public abstract void hunt();

    public String getTypeMoving() {
        return typeMoving;
    }

    @Override
    public String toString() {
        return getName() + " этому животному - " + getAge() + " года, среда обитания -  " + getLivingEnvironment() + ", тип передвижения - " + typeMoving;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return typeMoving.equals(birds.typeMoving);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeMoving);
    }
}
