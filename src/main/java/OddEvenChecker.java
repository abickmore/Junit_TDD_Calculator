package main.java;

public class OddEvenChecker {

    /**
     * This method verifies if the given number is odder number or not.
     *
     * @param number
     * @return false if number is even, true if number is odd
     */

    public boolean isOddNumber(int number){
        if (number % 2 == 0){
            return false;
        }
        return true;
    }
}
