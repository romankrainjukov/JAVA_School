
package entity;


public class Outcome {
    private Long id;
    private Person person;
    private Topic topic;
    private enum grade{
       FAIL,
       ACCEPTABLE,
       SATISFACTORY,
       GOOD,
       EXCELLENT;
        
    }

    public Outcome() {
    }

    public Outcome(Long id, Person person, Topic topic) {
        this.id = id;
        this.person = person;
        this.topic = topic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
    
}
