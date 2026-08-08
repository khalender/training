package be.he2b.dev2.td8;

import java.util.ArrayList;
import java.util.List;

/**
 * An address book with {@code update()} and {@code merge()} methods.
 *
 * @author DEV2
 */
public class PhoneBook {

    private final List<Contact> contacts;

    public PhoneBook() {
        this.contacts = new ArrayList<>();
    }

    public void add(Contact c) {
        this.contacts.add(c);
    }

    public void display() {
        for (Contact c : this.contacts) {
            System.out.println(c.getFullName() + " - " + c.getAddress() + " - " + c.getPhone());
        }
    }

    public List<Contact> getContacts() {
        return this.contacts;
    }

    public int size() {
        return this.contacts.size();
    }

    /**
     * Updates the address and phone of the contact at {@code numContact}.
     *
     * @param numContact the contact's position
     * @param adresse the new address
     * @param phone the new phone number
     */
    public void update(int numContact, String adresse, int phone) {
        if (numContact < 0 || numContact >= this.contacts.size()) {
            throw new IndexOutOfBoundsException("Index invalide : " + numContact);
        }
        Contact c = this.contacts.get(numContact);
        c.setAddress(adresse);
        c.setPhone(phone);
    }

    /**
     * Merges another phonebook into this one, adding all its contacts.
     *
     * @param other the phonebook to merge
     */
    public void merge(PhoneBook other) {
        this.contacts.addAll(other.getContacts());
    }
}
