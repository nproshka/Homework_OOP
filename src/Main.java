import transport.Car;
import transport.Car.Key;
import transport.Car.Insurance;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Person(35, "Максим", "Владивасток", 1987, 9, 20, "Почтальон");
        person[1] = new Person(29, "Аня", "Москва", 1993, 3, 21, "Методист образовательных программ");
        person[2] = new Person(28, "Катя", "Калининград", 1994, 5, 13, "Продакт-менеджер");
        person[3] = new Person(27, "Артём", "Москва", 1995, 8, 20, "Директор по развитию бизнес");

        for (Person value : person) {
            System.out.println(value);
        }

        Person Vladimir = new Person(21, "Владимир", "Казань", 2001, 9, 2, null);
        System.out.println(Vladimir);

        System.out.println();



        Car[] cars = new Car[5];
        cars[0] = new Car("Lada", "Grande", 1.7, "жёлтый", 2015, "", "Механическая", "Купе", "А232ТЕ", 2, "Летняя", new Key(true, false), new Insurance());
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Чёрный", 2020, "Германия", "Автоматическая", "Универсал", "В949ОО", 4, "Летняя", new Key(false, true),
                new Insurance(LocalDate.now().plusYears(2), 30000, "283829401"));
        cars[2] = new Car("BMW", "Z8", 3.0, "Чёрный", 2021, "Германия", "Автоматическая", "Универсал", "Н923АА", 4, "Летняя", new Key(true, true),
                new Insurance(LocalDate.now().plusYears(1), 25000, "2829401"));
        cars[3] = new Car("Kia", "Sportage 4 поколение", 2.4, "Красный", 2018, "Южная Корея", "Механическая", "Седан", "В942АА", 4, "Летняя", new Key(true, false), new Insurance());
        cars[4] = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея", "Автоматическая", "Кабриолет", "Е949ОО", 4, "Летняя", new Key(false, false), new Insurance());

        for (Car car : cars) {
           System.out.println(car);
        }


        System.out.println();

        Flower[] flowers = new Flower[4];
        flowers[0] = new Flower("Роза обыкновенная", "", "Голландия", 35.59);
        flowers[1] = new Flower("Хризантема", "", "", 15, 5);
        flowers[2] = new Flower("Пион", "", "Англия", 69.9, 1);
        flowers[3] = new Flower("Гипсофила", "", "Турция", 15, 10);

        for (Flower flower : flowers) {
            System.out.println(flower);
        }
    }
}