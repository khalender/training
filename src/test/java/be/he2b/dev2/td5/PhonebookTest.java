package be.he2b.dev2.td5;

import be.he2b.dev2.td3.Contact;
import be.he2b.dev2.td3.Phonebook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for {@link Phonebook} — covering 0, 1, and several contacts.
 *
 * <p>Test plan:
 * <table>
 *   <tr><th>Input</th><th>Expected</th><th>Notes</th></tr>
 *   <tr><td>empty phonebook</td><td>size 0</td><td>just created</td></tr>
 *   <tr><td>1 contact added</td><td>size 1, contact present</td><td></td></tr>
 *   <tr><td>3 contacts added</td><td>size 3, all present</td><td></td></tr>
 * </table>
 */
class PhonebookTest {

    @Test
    void emptyPhonebook_hasSizeZero() {
        Phonebook pb = new Phonebook();
        assertEquals(0, pb.getContacts().size());
    }

    @Test
    void oneContact_hasSizeOne() {
        Phonebook pb = new Phonebook();
        pb.add(new Contact("Albert", "Einstein", "rue d'Ailleurs", 12345));
        assertEquals(1, pb.getContacts().size());
    }

    @Test
    void severalContacts_allPresent() {
        Phonebook pb = new Phonebook();
        pb.add(new Contact("Albert", "Einstein", "rue d'Ailleurs", 12345));
        pb.add(new Contact("Mahatma", "Gandhi", "rue d'Autre Part", 54321));
        pb.add(new Contact("Nelson", "Mandela", "Avenue l'eau de là", 123321));

        assertEquals(3, pb.getContacts().size());
        assertTrue(pb.getContacts().stream()
                .anyMatch(c -> c.getFullName().equals("Albert Einstein")));
        assertTrue(pb.getContacts().stream()
                .anyMatch(c -> c.getFullName().equals("Mahatma Gandhi")));
        assertTrue(pb.getContacts().stream()
                .anyMatch(c -> c.getFullName().equals("Nelson Mandela")));
    }
}
