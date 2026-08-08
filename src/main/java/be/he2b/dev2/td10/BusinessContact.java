package be.he2b.dev2.td10;

import be.he2b.dev2.td9.Contact;

/**
 * A business contact — extends {@link Contact} with company information.
 *
 * <p>Demonstrates polymorphism in the PhoneBook/Contact system: a
 * {@code BusinessContact} can be treated as a {@code Contact} while
 * carrying extra data.
 *
 * @author DEV2
 */
public class BusinessContact extends Contact {

    private String companyName;
    private String companyAddress;
    private int companyPhone;

    public BusinessContact(String firstName, String name, String address, int phone,
                           String companyName, String companyAddress, int companyPhone) {
        super(firstName, name, address, phone);
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyPhone = companyPhone;
    }

    public BusinessContact(Contact contact, String companyName, String companyAddress, int companyPhone) {
        super(contact.getFirstName(), contact.getName(), contact.getAddress(), contact.getPhone());
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyPhone = companyPhone;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return this.companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public int getCompanyPhone() {
        return this.companyPhone;
    }

    public void setCompanyPhone(int companyPhone) {
        this.companyPhone = companyPhone;
    }

    @Override
    public String toString() {
        return "BusinessContact{" + getFullName() + " @ " + this.companyName
                + ", " + this.companyAddress + ", " + this.companyPhone + "}";
    }
}
