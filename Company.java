package model;

/**
 *
 * @author dpMelian
 */
public class Company extends Contact{
    private String name;
    private String description;
    private String telephone;
    private String email;

    public Company(String name, String description, String telephone, String email) {
        this.name = name;
        this.description = description;
        this.telephone = telephone;
        this.email = email;
    }
    
    public String getName(){
        return name;
    }
    
    public String getDescription(){
        return description;
    }
}
