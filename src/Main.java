public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Person(35, "Максим", "Минск",1987, 9, 20, "Бренд-менеджер");
        person[1] = new Person(29, "Аня", "Москва", 1993, 3, 21, "Методист образовательных программ");
        person[2] = new Person(28, "Катя", "Калининград", 1994, 5,13, "Продакт-менеджер");
        person[3] = new Person(27, "Артём", "Москва",1995,8, 20, "Директор по развитию бизнес");

        for (Person value : person) {
            System.out.println(value);
        }

        System.out.println();

        Car[] cars = new Car[5];
        cars[0] = new Car("Lada", "Grande", 1.7, "Жёлтый", 2015, "Россия");
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Чёрный", 2020, "Германия");
        cars[2] = new Car("BMW", "Z8", 3.0, "Чёрный", 2021, "Германия");
        cars[3] = new Car("Kia", "Sportage 4 поколение", 2.4, "Красный", 2018, "Южная Корея");
        cars[4] = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}