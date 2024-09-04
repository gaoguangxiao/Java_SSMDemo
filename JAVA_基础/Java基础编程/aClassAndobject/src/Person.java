/**
 * Person
 */
public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println(this.hashCode());
    }

    void speak() {
        System.out.println("说话");
    }
}