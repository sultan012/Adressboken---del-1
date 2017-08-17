import java.io.Serializable;
import java.util.UUID;

/**
 * Created by Sultan on 2016-11-28.
 */
public class Person implements Serializable {
   private String firstName;
   private String lastName;
   private String email;
   private UUID id;

    public Person(UUID id , String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\n----------------------------------------" +
                "\nId: " + id +
                "\nFirst Name: " + firstName  +
                "\nLast Name: " + lastName +
                "\nE.mail address : " + email +
                "\n----------------------------------------";
    }
}