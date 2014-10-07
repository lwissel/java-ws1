/** Exercise 2 computing unit conversions
 * based on the given conversion numbers
 *
 * 1t = 2240p
 * 1hw = 112p
 * 1q = 28p
 * 1s = 14p
 * 1o = 1/16p
 * 1d = 1/256p
 * 1g = 1/7000p
 * 1p = 0.45359237kg
 *
 *  @author   Lennart Wissel
 *  @version  05.10.2014
 */


public class Ex2 {
  /** Ex. 2a */
  /** converts from long ton to kg */
  public static double ton2Kilogram(double ton) {
    return (ton * 2240 * 0.45359237);
  }

  /** converts from hundredweight to kg */
  public static double hundredweight2Kilogram(double hw) {
    return (hw * 112 * 0.45359237);
  }

  /** converts from quarter to kg */
  public static double quarter2Kilogram(double quarter) {
    return (quarter * 28 * 0.45359237);
  }

  /** converts from stone to kg */
  public static double stone2Kilogram(double stone) {
    return (stone * 14 * 0.45359237);
  }

  /** converts from ounce to kg */
  public static double ounce2Kilogram(double ounce) {
    return (ounce * 1.0/16 * 0.45359237);
  }

  /** converts from drachm to kg */
  public static double drachm2Kilogram(double drachm) {
    return (drachm * 1.0/256 * 0.45359237);
  }

  /** converts from grain to kg */
  public static double grain2Kilogram(double grain) {
    return (grain * 1.0/7000 * 0.45359237);
  }

  /** converts from pound to kg */
  public static double pound2Kilogram(double pound) {
    return (pound * 0.45359237);
  }

  /** Excercise 2b 
   * just use the pounds input, stones is redundant, see above
   * return the next (ceiling) integer value
   */
  public static int imperial2Metric(int stones, int pounds) {
    return (int) Math.ceil((double) pounds * 0.45359237);
  }


  public static void main(String[] args) {
    /** Test for values Ex2 a */
    /** should always return 0.453.. by definition*/
    System.out.println("##### Ex. 2a");
    System.out.println(ton2Kilogram(1/2240.));
    System.out.println(hundredweight2Kilogram(1/112.));
    System.out.println(quarter2Kilogram(1/28.));
    System.out.println(stone2Kilogram(1/14.));
    System.out.println(ounce2Kilogram(16.));
    System.out.println(drachm2Kilogram(256.));
    System.out.println(grain2Kilogram(7000.));
    System.out.println(pound2Kilogram(1.0));

    /** Ex2 b */
    System.out.println("");
    System.out.println("##### Ex. 2b");
    System.out.println(imperial2Metric(0, 100)); //should be 46
  }
}
