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
        contacts = new ArrayList<Contact>();
        groups = new ArrayList<Group>();
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
    public void removePerson(int pos){
        contacts.remove(pos);
    }
    public void removeCompany(int pos){
        contacts.remove(pos);
    }
    public void removeGroup(int pos){
        groups.remove(pos);
    }
    public void removePerson(Contact person){
        contacts.remove(person);
    }
    public void removeCompany(Contact company){
        contacts.remove(company);
    }
    public void removeGroup(Group group){
        groups.remove(group);
    }
}