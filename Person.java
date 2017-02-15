package model;

/**
 *
 * @author dpMelian
 */
public class Person extends Contact{
    private String firstName;
    private String lastName;
    private String telephone;
    private String email;

    public Person(String firstName, String lastName, String telephone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.email = email;
    }
    
    public String getName(){
        return (firstName+ " " +lastName);
    }
}