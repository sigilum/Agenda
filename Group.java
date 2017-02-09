package model;

import java.util.ArrayList;

/**
 *
 * @author dpMelian
 */

public class Group {
    public String name;
    public ArrayList<Contact>contacts;

    public Group(String name) {
        this.name = name;
        contacts=new ArrayList<Contact>();
    }
    public void addContact(Contact contact){
        contacts.add(contact);
    }
}
