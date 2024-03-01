package src.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Person{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return "Person [firstName= "+ firstName + ", lastName= " + lastName +", age= "+ age + "]";
    }
}
public class Exercise1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("hiamsnhu", "kushwah", 25),
                new Person("hiamsnhu", "kushwah", 25));
    }
}
