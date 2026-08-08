package be.he2b.dev2.td8;

/**
 * A fully encapsulated contact: name, firstName, address must be ≥ 2 chars,
 * phone must be a positive int with ≥ 4 digits.
 *
 * @author DEV2
 */
public class Contact {

    private String firstName;
    private String name;
    private String address;
    private int phone;

    public Contact(String firstName, String name, String address, int phone) {
        setFirstName(firstName);
        setName(name);
        setAddress(address);
        setPhone(phone);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() < 2) {
            throw new IllegalArgumentException("Le prénom doit faire au moins 2 caractères");
        }
        this.firstName = firstName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 2) {
            throw new IllegalArgumentException("Le nom doit faire au moins 2 caractères");
        }
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        if (address == null || address.length() < 2) {
            throw new IllegalArgumentException("L'adresse doit faire au moins 2 caractères");
        }
        this.address = address;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        if (phone <= 0) {
            throw new IllegalArgumentException("Le téléphone doit être positif");
        }
        if (String.valueOf(phone).length() < 4) {
            throw new IllegalArgumentException("Le téléphone doit avoir au moins 4 chiffres");
        }
        this.phone = phone;
    }

    public String getFullName() {
        return this.firstName + " " + this.name;
    }
}
