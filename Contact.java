package model;

/**
 *
 * @author dpMelian
 */
public abstract class Contact {
    private String telephone;
    private String email;
    private String address;
    private String letter;

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }
    
    public abstract String getName();
    
}