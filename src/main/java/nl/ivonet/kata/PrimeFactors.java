package nl.ivonet.kata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> process(final int input) {
        int primefactor = input;
        final List<Integer> factors = new ArrayList<Integer>();

        for (int candidate = 2; primefactor > 1; candidate++) {
            while ((primefactor % candidate) == 0) {
                factors.add(candidate);
                primefactor /= candidate;
            }
        }
        return factors;
    }
}
