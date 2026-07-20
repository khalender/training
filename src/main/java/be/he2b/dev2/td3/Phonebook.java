package be.he2b.dev2.td3;

import java.util.ArrayList;
import java.util.List;

/**
 * An address book: a collection of {@link Contact}s.
 *
 * @author DEV2
 */
public class Phonebook {

    private final List<Contact> contacts;

    public Phonebook() {
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
}
