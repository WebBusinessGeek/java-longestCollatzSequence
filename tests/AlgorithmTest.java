import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MacBookEr on 9/28/15.
 */
public class AlgorithmTest {

    @Test
    public void itShouldReturnTrueForTestingStatus() {
        Algorithm algo = new Algorithm();
        algo.setTestsAreWorkingStatus(true);
        boolean result = algo.getTestsAreWorkingStatus();
        boolean correct = true;
        assertEquals(correct, result);
    }

}