package nl.ivonet.kata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> process(final int input) {
        final List<Integer> factors = new ArrayList<Integer>();


        if (input ==  3) {
            factors.add(3);
        }
        if (input ==  2) {
            factors.add(2);
        }

        return factors;
    }
}
