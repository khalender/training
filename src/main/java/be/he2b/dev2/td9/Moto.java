package be.he2b.dev2.td9;

/**
 * A motorcycle — extends {@link Vehicle} with a specific tank capacity.
 *
 * @author DEV2
 */
public class Moto extends Vehicle {

    public Moto(String brand, double maxTank) {
        super(brand, maxTank);
    }

    @Override
    public String toString() {
        return "Moto[" + this.brand + ", maxTank=" + this.maxTank + ", tank=" + this.tank + "]";
    }
}
