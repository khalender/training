package be.he2b.dev2.td6;

/**
 * Small arithmetic/modulo program used as a basic debugger tutorial.
 *
 * <p>Set a breakpoint on the {@code if} statement and step through to
 * watch the variables change. The program should print 12.
 *
 * @author DEV2
 */
public class Tuto1 {

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 21;
        int res;

        if (n1 % 2 == n2 % 2) {
            res = n2 * n1;
        } else {
            res = n2 - n1 + 1;
        }

        System.out.println(res);
    }
}
