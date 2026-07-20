package be.he2b.dev2.td2;

/**
 * A contact in an address book: first name, name, address, and phone number.
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

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return this.firstName + " " + this.name;
    }
}
