import org.junit.Test;
import java.util.ArrayList;

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

    @Test
    public void itShouldReturnTrueIfNumberIsEven() {
        Algorithm algo = new Algorithm();

        boolean result1 = algo.isEven(2);
        boolean result2 = algo.isEven(20);
        boolean result3 = algo.isEven(86);
        boolean result4 = algo.isEven(1456);

        ArrayList <Boolean> result = new ArrayList<>();
        result.add(result1);
        result.add(result2);
        result.add(result3);
        result.add(result4);

        ArrayList <Boolean> correct = new ArrayList<>();
        correct.add(true);
        correct.add(true);
        correct.add(true);
        correct.add(true);

        assertEquals(correct, result);
    }

    @Test
    public void itShouldReturnFalseIfOdd() {
        Algorithm algo = new Algorithm();

        boolean result1 = algo.isEven(3);
        boolean result2 = algo.isEven(23);
        boolean result3 = algo.isEven(87);
        boolean result4 = algo.isEven(1459);

        ArrayList <Boolean> result = new ArrayList<>();
        result.add(result1);
        result.add(result2);
        result.add(result3);
        result.add(result4);

        ArrayList <Boolean> correct = new ArrayList<>();
        correct.add(false);
        correct.add(false);
        correct.add(false);
        correct.add(false);

        assertEquals(correct, result);
    }

}