package be.he2b.dev2.td5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit tests for {@link Dog} — boundary values for {@code sound()}, state
 * changes, exceptions, and the {@code isWeightBetween} refactoring exercise.
 */
class DogTest {

    // --- sound() boundary values (Tutoriel 1 & 2) ---

    @Test
    void sound_weight_9_is_small() {
        Dog dog = new Dog("chien", 9);
        assertEquals("Yip yip", dog.sound());
    }

    @Test
    void sound_weight_10_is_medium() {
        Dog dog = new Dog("chien", 10);
        assertEquals("Wouf", dog.sound());
    }

    @Test
    void sound_weight_11_is_medium() {
        Dog dog = new Dog("chien", 11);
        assertEquals("Wouf", dog.sound());
    }

    @Test
    void sound_weight_29_is_medium() {
        Dog dog = new Dog("chien", 29);
        assertEquals("Wouf", dog.sound());
    }

    @Test
    void sound_weight_30_is_medium() {
        Dog dog = new Dog("chien", 30);
        assertEquals("Wouf", dog.sound());
    }

    @Test
    void sound_weight_31_is_big() {
        Dog dog = new Dog("chien", 31);
        assertEquals("WOUUUF", dog.sound());
    }

    // --- Constructor validation ---

    @Test
    void constructor_weight_zero_throws() {
        assertThrows(IllegalArgumentException.class, () -> new Dog("chien", 0));
    }

    @Test
    void constructor_weight_negative_throws() {
        assertThrows(IllegalArgumentException.class, () -> new Dog("chien", -1));
    }

    // --- State tests (Exercices 2-5) ---

    @Test
    void new_dog_not_injuried() {
        Dog dog = new Dog("chien", 20);
        assertFalse(dog.isInjured());
    }

    @Test
    void new_dog_not_hungry() {
        Dog dog = new Dog("chien", 20);
        assertFalse(dog.isHungry());
    }

    @Test
    void run_after_run_is_hungry() {
        Dog dog = new Dog("chien", 20);
        dog.run();
        assertTrue(dog.isHungry());
    }

    @Test
    void eat_not_hungry_anymore() {
        Dog dog = new Dog("chien", 20);
        dog.run();
        dog.eat();
        assertFalse(dog.isHungry());
    }

    @Test
    void run_when_hungry_does_not_run_ISE() {
        Dog dog = new Dog("chien", 20);
        dog.run();
        assertThrows(IllegalStateException.class, dog::run);
    }

    // --- bark(int) exception cases ---

    @Test
    void bark_zero_throws() {
        Dog dog = new Dog("chien", 20);
        assertThrows(IllegalArgumentException.class, () -> dog.bark(0));
    }

    @Test
    void bark_negative_throws() {
        Dog dog = new Dog("chien", 20);
        assertThrows(IllegalArgumentException.class, () -> dog.bark(-1));
    }

    // --- isWeightBetween (Exercice 7 — refactoring safety net) ---

    @Test
    void isWeightBetween_nb1_before_nb2_and_weigth_is_inside() {
        Dog dog = new Dog("chien", 10);
        assertTrue(dog.isWeightBetween(4, 24));
    }

    @Test
    void isWeightBetween_nb1_before_nb2_and_weigth_is_below() {
        Dog dog = new Dog("chien", 12);
        assertFalse(dog.isWeightBetween(13, 24));
    }

    @Test
    void isWeightBetween_nb1_before_nb2_and_weigth_is_above() {
        Dog dog = new Dog("chien", 25);
        assertFalse(dog.isWeightBetween(13, 24));
    }

    @Test
    void isWeightBetween_nb1_before_nb2_and_weigth_is_nb1() {
        Dog dog = new Dog("chien", 13);
        assertTrue(dog.isWeightBetween(13, 24));
    }

    @Test
    void isWeightBetween_nb1_before_nb2_and_weigth_is_nb2() {
        Dog dog = new Dog("chien", 24);
        assertTrue(dog.isWeightBetween(13, 24));
    }

    @Test
    void isWeightBetween_nb1_after_nb2_and_weigth_is_inside() {
        Dog dog = new Dog("chien", 30);
        assertTrue(dog.isWeightBetween(42, 24));
    }

    @Test
    void isWeightBetween_nb1_after_nb2_and_weigth_is_below() {
        Dog dog = new Dog("chien", 23);
        assertFalse(dog.isWeightBetween(33, 24));
    }

    @Test
    void isWeightBetween_nb1_after_nb2_and_weigth_is_above() {
        Dog dog = new Dog("chien", 34);
        assertFalse(dog.isWeightBetween(33, 24));
    }

    @Test
    void isWeightBetween_nb1_after_nb2_and_weigth_is_nb1() {
        Dog dog = new Dog("chien", 33);
        assertTrue(dog.isWeightBetween(33, 24));
    }

    @Test
    void isWeightBetween_nb1_after_nb2_and_weigth_is_nb2() {
        Dog dog = new Dog("chien", 24);
        assertTrue(dog.isWeightBetween(33, 24));
    }
}
