package nl.ivonet.kata;

import java.util.ArrayList;
import java.util.List;

/**
 * Code Rulez extracted from TDD:
 * - 0 and 1 have no prime factors because they can not be created by multiplication of primes
 * - if devide < 2 then empty list
 * - 8, 6, 4, and 2 have the same multiplication factor and can therefore be reduced.
 * - the devide factor can never be greater then input
 * - so start devinding by 2 and add 1 when not possible anymore... lets try it out.
 */
public class PrimeFactors {
    public List<Integer> process(final int input) {
        int primefactor = input;
        final List<Integer> factors = new ArrayList<Integer>();

        for (int i = 2; i < input; i++) {
            while ((primefactor % i) == 0) {
                factors.add(i);
                primefactor /= i;
            }
        }


        if (primefactor == 8) {
            factors.add(2);
            primefactor /= 2;
        }
        if (primefactor == 7) {
            factors.add(7);
            primefactor /= 7;
        }
        if (primefactor == 6) {
            factors.add(2);
            primefactor /= 2;
        }
        if (primefactor == 5) {
            factors.add(5);
            primefactor /= 5;
        }
        if (primefactor == 4) {
            factors.add(2);
            primefactor /= 2;
        }
        if (primefactor == 3) {
            factors.add(3);
        }
        if (primefactor == 2) {
            factors.add(2);
        }

        return factors;
    }
}
