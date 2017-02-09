package model;

import java.util.ArrayList;

/**
 *
 * @author dpMelian
 */
public class Agenda {
    public ArrayList<Contact>contacts;
    public ArrayList<Group>groups;
    public Agenda(){
        contacts=new ArrayList<Contact>();
        groups=new ArrayList<Group>();
    }
    public void addPerson(String firstName, String lastName, String telephone,
            String email){
        Contact newContact = new Person(firstName, lastName, telephone, email);
        contacts.add(newContact);
    }
    public void addCompany(String name, String description,
            String telephone, String email){
        Contact newContact = new Company(name, description, telephone, email);
        contacts.add(newContact);
    }
    public void addGroup(String name){
        groups.add(new Group(name));
    }
}