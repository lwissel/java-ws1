/** Exercise 3 of WS 1
 * calculates the added capital sum of a given capital
 * in accordance to given interest Rate and the duration in years
 *
 * @author  Lennart Wissel
 * @version 05.10.2014
 */

public class Ex3 {

  // Calculate the resulting added capital sum to the given paramters
  public static double interestAddedCapitalSum(double capitalSum, double interestRate, int years) {
    return capitalSum * Math.pow(1.+0.01*interestRate,years);
  }

  public static void main(String[] args) {

    // Define local parameters
    int years = 2;
    double capitalSum = 1000.0;
    double interestRate = 5;

    // returns 1102.50
    System.out.println("For the given capital sum of " + capitalSum +
                        " pounds and the interest rate of " + interestRate +
                        " over " + years + " years the return will be " +
                        interestAddedCapitalSum(capitalSum, interestRate, years));
  }
}
