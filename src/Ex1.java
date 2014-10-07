/** Exercise 1 computing the area of a circle
 *
 *  A = pi r^2
 *
 *  @author   Lennart Wissel
 *  @version  05.10.2014
 */


public class Ex1 {

  /** calculates the area of a circle for a given double r */
  public static double circleArea(double r) {
    return Math.PI * Math.pow(r,2);
  }

  public static String printArea(double r) {
    return "For the given radius r = " + r + ", the circle area evaluates to: " + circleArea(r);
  }

  public static void main(String[] args) {
    System.out.println(printArea(0));
    System.out.println(printArea(1));
    System.out.println(printArea(2));
    System.out.println(printArea(3));
    System.out.println(printArea(4.4));
    System.out.println(printArea(5));
  }
}
