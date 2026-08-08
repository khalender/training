package be.he2b.dev2.td9;

import java.util.Objects;

/**
 * Superclass for motorized vehicles with fuel-consumption logic.
 *
 * <p>Consumption: 0.1L per km by default. Subclasses can override
 * {@link #ride(int)} to change the consumption rate.
 *
 * @author DEV2
 */
public class Vehicle {

    protected String brand;
    protected double maxTank;
    protected double tank;

    public Vehicle(String brand, double maxTank) {
        this.brand = brand;
        this.maxTank = maxTank;
        this.tank = maxTank;
    }

    public void fillUpGaz() {
        this.tank = this.maxTank;
        System.out.println(this.getClass().getSimpleName() + " : tank filled ("
                + this.tank + " L)");
    }

    public void ride(int distance) {
        for (int km = 0; km < distance; km++) {
            if (this.tank <= 0) {
                System.out.println("I'm out of gas!");
                return;
            }
            this.tank -= 0.1;
        }
        System.out.println("Driving " + distance + " km");
    }

    public String getBrand() {
        return this.brand;
    }

    public double getMaxTank() {
        return this.maxTank;
    }

    public double getTank() {
        return this.tank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.maxTank, this.maxTank) == 0
                && Double.compare(vehicle.tank, this.tank) == 0
                && Objects.equals(this.brand, vehicle.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.brand, this.maxTank, this.tank);
    }
}
