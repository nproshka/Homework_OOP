public class Person {

    int age;
    String name;
    String city;
    int yearBirth;
    int monthBirth;
    int dayBirth;
    String post;

    public Person(int age, String name, String city, int yearBirth, int monthBirth, int dayBirth, String post) {
        this.age = age;
        this.name = name;
        this.city = city;
        this.yearBirth = yearBirth;
        this.monthBirth = monthBirth;
        this.dayBirth = dayBirth;
        this.post = post;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getMonthBirth() {
        return monthBirth;
    }

    public void setMonthBirth(int monthBirth) {
        this.monthBirth = monthBirth;
    }

    public int getDayBirth() {
        return dayBirth;
    }

    public void setDayBirth(int dayBirth) {
        this.dayBirth = dayBirth;
    }

    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в " + yearBirth + " году. Я работаю на должности " + post + ". Будем знакомы!";
    }
}