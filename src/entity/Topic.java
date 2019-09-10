
package entity;


public class Topic {
    private Long id;
    private String topicName;
    private String topicType;
    private String description;
    private Long volume;

    public Topic() {
    }

    public Topic(Long id, String topicName, String topicType, String description, Long volume) {
        this.id = id;
        this.topicName = topicName;
        this.topicType = topicType;
        this.description = description;
        this.volume = volume;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicType() {
        return topicType;
    }

    public void setTopicType(String topicType) {
        this.topicType = topicType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }
    
    
}
