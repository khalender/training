package be.he2b.dev2.td6;

/**
 * Deliberately buggy palindrome checker — used as a debugger exercise.
 *
 * <p>The bug: the {@code return true} inside the {@code else} branch causes
 * the method to exit early on the first matching pair, never checking the
 * rest of the array. The 3-case test plan catches this on the 3rd case.
 *
 * <pre>
 * Test plan:
 * | no | input          | expected | note           | result (buggy) |
 * |----|----------------|----------|----------------|----------------|
 * | 1  | {1,2,3,2,1}    | true     | palindrome     | passes         |
 * | 2  | {1,2,3,4}      | false    | not palindrome | passes         |
 * | 3  | {1,2,3,4,1}    | false    | début seulement | FAILS (returns true) |
 * </pre>
 *
 * @author DEV2
 */
public class Palindrome {

    /**
     * BUGGY version — returns early due to a misplaced {@code return true}
     * inside the else branch. Use the debugger to trace and find the bug,
     * then fix it (see {@link #isPalindromeFixed(int[])}).
     */
    public static boolean isPalindrome(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != tab[tab.length - 1 - i]) {
                return false;
            } else {
                return true;  // BUG: should not return here
            }
        }
        return true;
    }

    /**
     * Fixed version — checks all pairs, only stops on mismatch.
     * Also optimized: only needs to check first half.
     */
    public static boolean isPalindromeFixed(int[] tab) {
        for (int i = 0; i < tab.length / 2; i++) {
            if (tab[i] != tab[tab.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
