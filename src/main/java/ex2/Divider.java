package ex2;

public class Divider {

   public static int[] divide(int[] dividends, int[] divisors) {

      if (dividends == null || divisors == null)
         throw new IllegalArgumentException("Dividend and divisor arrays cannot be null.");

      if (dividends.length != divisors.length)
         throw new IllegalArgumentException("Dividend and divisor arrays must have the same length.");

      int length = dividends.length;
      int[] quotients = new int[length];

      for (int i = 0; i < length; i++) {
         int divisor = divisors[i];

         if (divisor == 0)
            throw new IllegalArgumentException("Divisor array cannot contain zeros.");

         quotients[i] = (int) Math.round((double) dividends[i] / divisors[i]);
      }

      return quotients;
   }

}
