package pro.sky.java.course2;

public class Main {

    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person sarah = new Person("Sarah", 30);
        if (personService.isAdult(sarah)) {
            System.out.println("Иди в бар");
        } else {
            System.out.println("Иди в школу");
        }
        sarah.increaseAge(31);
        System.out.println(sarah);
    }

}
