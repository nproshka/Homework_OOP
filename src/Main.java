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

    }
}