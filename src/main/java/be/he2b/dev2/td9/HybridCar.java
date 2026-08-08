package be.he2b.dev2.td9;

/**
 * A hybrid car — extends {@link Car} and overrides {@code ride()} to use
 * only 0.05L per km (electric assistance).
 *
 * @author DEV2
 */
public class HybridCar extends Car {

    public HybridCar(String brand, double maxTank, int nSeats) {
        super(brand, maxTank, nSeats);
    }

    @Override
    public void ride(int distance) {
        for (int km = 0; km < distance; km++) {
            if (this.tank <= 0) {
                System.out.println("I'm out of gas!");
                return;
            }
            this.tank -= 0.05;
        }
        System.out.println("Driving " + distance + " km (hybrid)");
    }
}
