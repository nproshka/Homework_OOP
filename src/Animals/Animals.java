package Animals;

import java.util.Objects;

public abstract class Animals {
    private final String name;
    private final int age;
    private String livingEnvironment;

    public Animals(String name, int age, String livingEnvironment) {

        if(name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Некорретная кличка";
        } else {
            this.name = name;
        }

        this.age = Math.max(age, 0);

        setLivingEnvironment(livingEnvironment);
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void go();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Наземно-водушная";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && name.equals(animals.name) && livingEnvironment.equals(animals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, livingEnvironment);
    }
}
