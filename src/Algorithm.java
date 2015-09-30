import java.util.ArrayList;

public class Algorithm {

    private Boolean testsAreWorkingStatus = false;

    public void setTestsAreWorkingStatus(boolean newStatus) {
        this.testsAreWorkingStatus = newStatus;
    }

    public boolean getTestsAreWorkingStatus() {
        return this.testsAreWorkingStatus;
    }

    public boolean isEven(int numberToCheck) {
        return (numberToCheck % 2 == 0);
    }

    public ArrayList <Integer> returnCollatzSequenceStoppingAtOne(int baseNumber) {
        ArrayList <Integer> returnValue = new ArrayList<>();
        returnValue.add(baseNumber);
        boolean reachedOne = false;
        int n = baseNumber;

        while(!reachedOne) {
            if(this.isEven(n)) {
                n = n / 2;
                returnValue.add(n);
                reachedOne = (n == 1);
            }
            else {
                n = (n * 3) + 1;
                returnValue.add(n);
                reachedOne = (n == 1);
            }
        }
        return returnValue;
    }

    public int findBaseNumberWithLongestCollatzSequence(int baseNumber, int stopNumber) {
        int returnValue = 0;
        int longestSequence = 0;

        while(baseNumber <= stopNumber) {
            int collatzSequenceSize = this.returnCollatzSequenceStoppingAtOne(baseNumber).size();
            if(collatzSequenceSize > longestSequence) {
                returnValue = baseNumber;
                longestSequence = collatzSequenceSize;
            }
            baseNumber++;
        }

        return returnValue;
    }
}
