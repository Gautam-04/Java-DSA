package OOPs;

public class Question17 {
    public static void main(String[] args) {
Person person = new Person("Gautam",19,"India");
        System.out.println(person.getName());
        person.setName("Bob");
        System.out.println(person.getName());
    }
}

class Person{

    private String name;
    private int age;
    private String country;

    public Person(String name,int age, String country){
        this.name= name;
        this.age = age;
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }
}