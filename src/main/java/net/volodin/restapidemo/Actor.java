package net.volodin.restapidemo;

import org.hibernate.annotations.Type;
import org.springframework.lang.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "actor")
public class Actor {
    @Id
    @Column(name = "actorId")
    @Type(type = "int")
    private Long actorId;
    private String firstName;
    @NonNull
    private String lastName;
    @Column(name = "last_update")
    private Timestamp lastUpdated;

    public Actor(Long actorId,
                 String firstName,
                 @NonNull String lastName,
                 Timestamp lastUpdated) {

        this.actorId = actorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdated = lastUpdated;
    }

    public Long getActorId() {
        return actorId;
    }

    public void setActorId(Long actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @NonNull
    public String getLastName() {
        return lastName;
    }

    public void setLastName(@NonNull String lastName) {
        this.lastName = lastName;
    }

    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actorId=" + actorId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
