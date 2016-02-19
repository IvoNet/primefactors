package nl.ivonet.kata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> process(final int input) {
        int primefactor = input;
        final List<Integer> factors = new ArrayList<Integer>();

        for (int candidate = 2; primefactor > 1; candidate++)
            for (; (primefactor % candidate) == 0; primefactor /= candidate) factors.add(candidate);
        return factors;
    }
}
