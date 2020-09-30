package kata1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Alberto
 */
public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Antonio Martin", LocalDate.of(1994, Month.MARCH, 23));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
    
}
