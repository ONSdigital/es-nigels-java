package algorithmia.nigelsalgorithm;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for nigelsalgorithm algorithm
 */
public class nigelsalgorithmTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public nigelsalgorithmTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(nigelsalgorithmTest.class);
    }

    /**
     * Basic test
     */
    public void testnigelsalgorithm() throws Exception {
        // If you made a constructor with multiple arguments, this will fail to compile
        // and for the time being, we think that's better than an InstantiationException
        // when trying to run the algorithm. If this bites you, sorry.
        nigelsalgorithm algorithm = new nigelsalgorithm();

        // Below is a test case that expects the apply method to take a string.
        // Since you may want an apply method that takes something else, we've
        // commented out this test for now so you don't get an annoying compile error.
        //assertEquals(algorithm.apply("Bob"), "Hello Bob");
    }
}
