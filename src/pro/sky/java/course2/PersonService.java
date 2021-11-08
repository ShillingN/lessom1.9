package pro.sky.java.course2;

public class PersonService {
    public boolean isAdult(Person person) {
        return person.getAge() > 18;
    }
}
