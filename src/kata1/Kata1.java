package kata1;

import java.util.Date;

public class Kata1 {
    public static void main(String[] args) {
        Person person = new Person("Tori", new Date(04,7,2));
        System.out.println((person.getName() + " tiene: " + person.getAge()) + " años");
    }
}
