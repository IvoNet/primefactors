package nl.ivonet.kata;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
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

    @Test
    public void test2() throws Exception {
        assertEquals(Collections.singletonList(2), factors.process(2));
    }

    @Test
    public void test3() throws Exception {
        assertEquals(Collections.singletonList(3), factors.process(3));
    }

    @Test
    public void test4() throws Exception {
        assertEquals(Arrays.asList(2, 2), factors.process(4));
    }
}
