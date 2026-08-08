package be.he2b.dev2.td7;

/**
 * Utility class with {@code static} mathematical constants and methods.
 *
 * <p>Demonstrates {@code static} attributes, {@code static final} constants,
 * and {@code static} methods that can be called without instantiation.
 *
 * @author DEV2
 */
public final class MathUtil {

    public static final double PI = 3.141592653589793;
    public static final double E = 2.718281828459045;

    private MathUtil() {
    }

    public static double circleArea(double radius) {
        return PI * radius * radius;
    }

    public static double circlePerimeter(double radius) {
        return 2 * PI * radius;
    }

    public static double ellipseArea(double semiMajor, double semiMinor) {
        return PI * semiMajor * semiMinor;
    }
}
