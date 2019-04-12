package by.belhard.j2.lesson4a;


import by.belhard.j2.lesson4a.entity.Country;
import by.belhard.j2.lesson4a.entity.Person;
import by.belhard.j2.lesson4a.entity.Sex;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Pablo", 23, Sex.MALE);
        Person person2 = new Person("Anna", 20, Sex.FEMALE);

                person1.setCountry(new Country("Brazil", 123456 ));
        person2.setCountry(person1.getCountry());

        System.out.println(person1);
        System.out.println(person2);
    }

}