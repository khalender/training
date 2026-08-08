package be.he2b.dev2.td9;

import java.util.Objects;

/**
 * A contact with properly overridden {@code equals()} and {@code hashCode()}.
 *
 * <p>Homework exercise 2: override equals()/hashCode() and manually verify
 * that two contacts with identical data satisfy {@code .equals()} but not
 * {@code ==}.
 *
 * @author DEV2
 */
public class Contact {

    private String firstName;
    private String name;
    private String address;
    private int phone;

    public Contact(String firstName, String name, String address, int phone) {
        this.firstName = firstName;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return this.firstName + " " + this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Contact contact = (Contact) o;
        return this.phone == contact.phone
                && Objects.equals(this.firstName, contact.firstName)
                && Objects.equals(this.name, contact.name)
                && Objects.equals(this.address, contact.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.firstName, this.name, this.address, this.phone);
    }

    @Override
    public String toString() {
        return "Contact{" + getFullName() + ", " + this.address + ", " + this.phone + "}";
    }
}
