package kata1;

import java.time.LocalDate;

/**
 *
 * @author Alberto
 */
public class Person {
    private final String name;
    public LocalDate birthdate;

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        return toYear(LocalDate.now().toEpochDay() - birthdate.toEpochDay());
    }

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    private int toYear(long l) {
        return (int) (l/365);
    }
}
