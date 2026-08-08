package be.he2b.dev2.td5;

/**
 * A simple date (day / month / year) with leap-year logic, used as a TDD demo.
 *
 * @author DEV2
 */
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    /**
     * Returns {@code true} if this date's year is a leap year (bissextile).
     *
     * <p>Rules: multiples of 4 are leap, except multiples of 100, except
     * multiples of 400 which are leap again.
     */
    public boolean isLenient() {
        return (this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0);
    }
}
