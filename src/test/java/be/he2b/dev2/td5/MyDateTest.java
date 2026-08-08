package be.he2b.dev2.td5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * Unit tests for {@link MyDate} — leap-year logic (isLenient) used as a TDD demo.
 *
 * <p>Follows the TDD progression from the raw TD05 handout:
 * <ol>
 *   <li>Most years are not leap → false</li>
 *   <li>Multiples of 4 (but not 100) → true</li>
 *   <li>Multiples of 100 (but not 400) → false</li>
 *   <li>Multiples of 400 → true</li>
 * </ol>
 */
class MyDateTest {

    @Test
    void isLenient_false_when_not_multiple_of_4() {
        MyDate date = new MyDate(1, 1, 2003);
        assertFalse(date.isLenient());
    }

    @Test
    void isLenient_true_when_multiple_of_4_but_not_100() {
        MyDate date = new MyDate(1, 1, 2004);
        assertTrue(date.isLenient());
    }

    @Test
    void isLenient_false_when_multiple_of_100_but_not_400() {
        MyDate date = new MyDate(1, 1, 1900);
        assertFalse(date.isLenient());
    }

    @Test
    void isLenient_true_when_multiple_of_400() {
        MyDate date = new MyDate(1, 1, 2000);
        assertTrue(date.isLenient());
    }

    @Test
    void isLenient_true_for_2020() {
        MyDate date = new MyDate(1, 1, 2020);
        assertTrue(date.isLenient());
    }

    @Test
    void isLenient_true_for_2024() {
        MyDate date = new MyDate(1, 1, 2024);
        assertTrue(date.isLenient());
    }

    @Test
    void isLenient_false_for_2100() {
        MyDate date = new MyDate(1, 1, 2100);
        assertFalse(date.isLenient());
    }
}
