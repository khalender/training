package be.he2b.dev2.td9;

/**
 * A car — extends {@link Vehicle} with a number of seats.
 *
 * @author DEV2
 */
public class Car extends Vehicle {

    protected int nSeats;

    public Car(String brand, double maxTank, int nSeats) {
        super(brand, maxTank);
        this.nSeats = nSeats;
    }

    @Override
    public String toString() {
        return "Car[" + this.brand + ", seats=" + this.nSeats
                + ", maxTank=" + this.maxTank + ", tank=" + this.tank + "]";
    }
}
