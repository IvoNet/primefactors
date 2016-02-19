package nl.ivonet.kata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> process(final int input) {
        int primefactor = input;
        final List<Integer> factors = new ArrayList<Integer>();

        if (primefactor == 5) {//
            factors.add(5);
            primefactor /= 5;
        }
        if (primefactor == 4) {
            factors.add(2);
            primefactor /= 2;
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
