/** Exercise 4 of WS 1
 *
 * computes the sum and product of two given fractions
 *
 * @author  Lennart Wissel
 * @version 05.10.2014
 */


public class Ex4 {
  // Calculate the numerator of the sum
  public static int ns(int n1, int n2, int d1, int d2) {
    return (n1*d2 + n2*d1);
  }

  // Calculate the denominator of the sum
  public static int ds(int d1, int d2) {
    return (d1*d2);
  }

  // Calculate the numerator of the product
  public static int np(int n1, int n2) {
    return (n1*n2);
  }

  // Calculate the denominator of the product
  public static int dp(int d1, int d2) {
    return (d1*d2);
  }

  public static void main(String[] args) {
    // Testvariables
    int n1 = 1; int d1 = 2; // 1/2
    int n2 = 1; int d2 = 3; // 1/3

    System.out.println("The sum of " + n1 + "/" + d1 + " + " + n2 + "/" + d2 + " = " + ns(n1,n2,d1,d2) + "/" + ds(d1,d2));
    System.out.println("The product of " + n1 + "/" + d1 + " * " + n2 + "/" + d2 + " = " + np(n1,n2) + "/" + dp(d1,d2));
  }
}
