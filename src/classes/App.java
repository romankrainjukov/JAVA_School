
package classes;

import entity.Person;


public class App {
    public void run()
    {
        Person person1 = new Person();
        person1.setFirstname("Vasya");
        person1.setLastname("Pupkin");
        person1.setRole("pupil");
        
        System.out.println(person1.toString());
    }
}
