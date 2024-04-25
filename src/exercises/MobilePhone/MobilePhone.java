package exercises.MobilePhone;

import java.util.ArrayList;

public class MobilePhone {

    String myNumber;
    ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber, ArrayList<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public boolean addNewContact(Contact contact){
        boolean exists = !this.myContacts.contains(contact);
        if (exists) this.myContacts.add(contact);

        return exists;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        boolean exists = this.myContacts.contains(oldContact);
        int index;

        if (exists) {
            index = this.myContacts.indexOf(oldContact);
            this.myContacts.set(index, newContact);
        }

        boolean successfullyUpdated = this.myContacts.contains(newContact);

        return exists && successfullyUpdated;
    }

    public boolean removeContact(Contact contact){
        boolean exists = this.myContacts.contains(contact);
        boolean successfullyRemoved = false;
        if (exists) successfullyRemoved = this.myContacts.remove(contact);

        return exists && successfullyRemoved;
    }

    public int findContact(Contact contact){
        boolean exists = this.myContacts.contains(contact);
        int result = exists ? this.myContacts.indexOf(contact) : -1;
        return result;
    }

    public int findContact(String phoneNumber){
        int index = 0;

        for (int i = 0; i < this.myContacts.size(); i++){
            if (this.myContacts.get(i).getPhoneNumber().equals(phoneNumber)){
                index = i;
                break;
            }else{
                index = -1;
            }
        }
        return index;
    }

    public int queryContact(String name){
        int index = 0;

        for (int i = 0; i < this.myContacts.size(); i++){
            if (this.myContacts.get(i).getName().equals(name)){
                index = i;
                break;
            }else{
                index = -1;
            }
        }
        return index;
    }

    public void printContacts(){
        System.out.println("Contact List:\n");
        for (int i = 0; i < this.myContacts.size(); i++){
            System.out.printf("%d. %s -> %s\n", i+1, this.myContacts.get(i).getName(), this.myContacts.get(i).getPhoneNumber());
        }
    }
}