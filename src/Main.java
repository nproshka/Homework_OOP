import Animals.*;
import transport.Bus;
import transport.Car;
import transport.Car.Key;
import transport.Car.Insurance;
import transport.Train;

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
        cars[0] = new Car("Lada", "Grande", 1.7, "жёлтый", 2015, "", "Механическая", "Купе", "А232ТЕ", 2, "Летняя", new Key(true, false), new Insurance(), 200);
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Чёрный", 2020, "Германия", "Автоматическая", "Универсал", "В949ОО", 4, "Летняя", new Key(false, true),
                new Insurance(LocalDate.now().plusYears(2), 30000, "283829401"), 350);
        cars[2] = new Car("BMW", "Z8", 3.0, "Чёрный", 2021, "Германия", "Автоматическая", "Универсал", "Н923АА", 4, "Летняя", new Key(true, true),
                new Insurance(LocalDate.now().plusYears(1), 25000, "2829401"), 320);
        cars[3] = new Car("Kia", "Sportage 4 поколение", 2.4, "Красный", 2018, "Южная Корея", "Механическая", "Седан", "В942АА", 4, "Летняя", new Key(true, false), new Insurance(), 400);
        cars[4] = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея", "Автоматическая", "Кабриолет", "Е949ОО", 4, "Летняя", new Key(false, false), new Insurance(), 300);

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

        System.out.println();

        Train[] trains = new Train[2];
        trains[0] = new Train("Ласточка", "В-901", 2011, "Россия", 301, 3500, "Белорусская", "Минск-Пасажирский", 11);
        trains[1] = new Train("Ленинград", "D-125", 2019, "Россия", 270, 1700, "Ленинградская", "Ленинград-Пасажирский", 8);

        for (Train train : trains) {
            System.out.println(train);
        }

        System.out.println();

        Bus[] buses = new Bus[2];
        buses[0] = new Bus("Бренд1", "Модель1", 2010, "Россия", "Красно-белый", 210);
        buses[1] = new Bus("Бренд2", "Модель2", 2015, "Белоруссия", "Красно-чёрный", 301);

        for (Bus bus : buses) {
            System.out.println(bus);
        }
        System.out.println();

        cars[0].refill();
        buses[0].refill();
        trains[0].refill();

        System.out.println();

        Herbivorous[] herbivores = new Herbivorous[3];
        herbivores[0] = new Herbivorous("Газель-Зебрик", 5, "Наземно-воздушная", 50, "Растения");
        herbivores[1] = new Herbivorous("Жираф-Недорослик", 10, "Наземно-воздушная", 10, "Растения");
        herbivores[2] = new Herbivorous("Лошадь-Мазда", 15, "Наземно-воздушная", 55, "Растения");

        for (Herbivorous herbivore : herbivores) {
            System.out.println(herbivore);
        }

        System.out.println();

        Predator[] predators = new Predator[3];
        predators[0] = new Predator("Гиена-Алексей", 9, "Наземно-воздушная", 55, "Мясо");
        predators[1] = new Predator("Тигр-Пушок", 11, "Наземно-воздушная", 55, "Мясо");
        predators[2] = new Predator("Медведь-Тедди", 7, "Наземно-воздушная", 55, "Рыба");

        for (Predator predator : predators) {
            System.out.println(predator);
        }

        System.out.println();

        Amphibians[] amphibians = new Amphibians[2];
        amphibians[0] = new Amphibians("Лягушка-Зелёныш", 3, "Водно-наземная");
        amphibians[1] = new Amphibians("Уж-пресноводный-Жужа", 2, "Водно-наземная");

        for (Amphibians amphibian : amphibians) {
            System.out.println(amphibian);
        }

        System.out.println();

        Flying[] flyings = new Flying[3];
        flyings[0] = new Flying("Чайка-Рыбак", 4, "Наземно-воздушная", "Летающе-ходящий");
        flyings[1] = new Flying("Альбатрос-Живоглот", 15, "Наземно-воздушная", "Летающе-ходящий");
        flyings[2] = new Flying("Сокол-Миша", 15, "Наземно-воздушная", "Летающе-ходящий");

        for (Flying flying : flyings) {
            System.out.println(flying);
        }

        System.out.println();

        NonFlyingBird[] nonFlyingBirds = new NonFlyingBird[3];
        nonFlyingBirds[0] = new NonFlyingBird("Додо-Хохолок", 15, "Наземно-воздушная", "Ходьба");
        nonFlyingBirds[1] = new NonFlyingBird("Пингвин-Трёхцветик", 15, "Наземно-воздушная", "Ходьба");
        nonFlyingBirds[2] = new NonFlyingBird("Павлин-Красавчик", 15, "Наземно-воздушная", "Ходьба");

        for (NonFlyingBird nonFlyingBird : nonFlyingBirds) {
            System.out.println(nonFlyingBird);
        }



    }
}
