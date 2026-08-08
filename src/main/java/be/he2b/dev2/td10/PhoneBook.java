package be.he2b.dev2.td10;

import be.he2b.dev2.td9.Contact;

import java.util.ArrayList;
import java.util.List;

/**
 * A phone book that can hold both private {@link Contact}s and
 * {@link BusinessContact}s, demonstrating polymorphism.
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
            if (c instanceof BusinessContact bc) {
                System.out.println("  " + bc.getFullName() + " - " + bc.getPhone()
                        + " | Company: " + bc.getCompanyName()
                        + ", " + bc.getCompanyAddress()
                        + ", " + bc.getCompanyPhone());
            } else {
                System.out.println("  " + c.getFullName() + " - " + c.getPhone());
            }
        }
    }

    public List<Contact> getContacts() {
        return this.contacts;
    }

    public int size() {
        return this.contacts.size();
    }

    /** Returns the number of private (non-business) contacts. */
    public int nPrivateContact() {
        int count = 0;
        for (Contact c : this.contacts) {
            if (!(c instanceof BusinessContact)) {
                count++;
            }
        }
        return count;
    }

    /** Returns the number of business contacts. */
    public int nCompanyContact() {
        int count = 0;
        for (Contact c : this.contacts) {
            if (c instanceof BusinessContact) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns all business contacts belonging to the given company.
     *
     * @param companyName the company name to search for
     * @return list of contacts in that company
     */
    public List<Contact> inCompany(String companyName) {
        List<Contact> result = new ArrayList<>();
        for (Contact c : this.contacts) {
            if (c instanceof BusinessContact bc && bc.getCompanyName().equals(companyName)) {
                result.add(c);
            }
        }
        return result;
    }

    /**
     * Updates the address and phone of the contact at {@code numContact}.
     */
    public void update(int numContact, String address, int phone) {
        if (numContact < 0 || numContact >= this.contacts.size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + numContact);
        }
        Contact c = this.contacts.get(numContact);
        c.setAddress(address);
        c.setPhone(phone);
    }

    /**
     * Overloaded update for business contacts — also updates company info.
     */
    public void update(int numContact, String address, int phone,
                       String companyAddress, int companyPhone) {
        if (numContact < 0 || numContact >= this.contacts.size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + numContact);
        }
        Contact c = this.contacts.get(numContact);
        c.setAddress(address);
        c.setPhone(phone);
        if (c instanceof BusinessContact bc) {
            bc.setCompanyAddress(companyAddress);
            bc.setCompanyPhone(companyPhone);
        }
    }

    /**
     * Transforms a private {@link Contact} into a {@link BusinessContact}.
     *
     * @param contact       the contact to convert
     * @param companyName   the company name
     * @param companyAddress the company address
     * @param companyPhone  the company phone
     * @throws IllegalArgumentException if the contact is not found
     */
    public void becomeProfessional(Contact contact, String companyName,
                                   String companyAddress, int companyPhone) {
        int index = this.contacts.indexOf(contact);
        if (index == -1) {
            throw new IllegalArgumentException("Contact not found in phonebook");
        }
        this.contacts.set(index, new BusinessContact(
                contact, companyName, companyAddress, companyPhone));
    }
}
