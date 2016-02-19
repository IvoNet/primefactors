package nl.ivonet.kata;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {

    private PrimeFactors factors;

    @Before
    public void setUp() throws Exception {
        this.factors = new PrimeFactors();
    }

    @Test
    public void test0() throws Exception {
        assertEquals(Collections.emptyList(), factors.process(0));
    }

    @Test
    public void test1() throws Exception {
        assertEquals(Collections.emptyList(), factors.process(1));
    }
}
