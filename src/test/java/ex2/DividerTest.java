package ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividerTest {

   @Test
   void shouldFailOnNullDividends() {
      int[] dividends = null;
      int[] divisors = new int[]{1, 2};

      assertThrows(IllegalArgumentException.class, () -> {
         Divider.divide(dividends, divisors);
      });
   }

   @Test
   void shouldFailOnNullDivisors() {
      int[] dividends = new int[]{1, 2};
      int[] divisors = null;

      assertThrows(IllegalArgumentException.class, () -> {
         Divider.divide(dividends, divisors);
      });
   }

   @Test
   void shouldFailOnDifferentInputLengths() {
      int[] dividends = new int[]{1, 2};
      int[] divisors = new int[]{1, 2, 3};

      assertThrows(IllegalArgumentException.class, () -> {
         Divider.divide(dividends, divisors);
      });
   }

   @Test
   void shouldFailWithZeroDivisors() {
      int[] dividends = new int[]{1, 2, 3};
      int[] divisors = new int[]{1, 0, 3};

      assertThrows(IllegalArgumentException.class, () -> {
         Divider.divide(dividends, divisors);
      });
   }

   @Test
   void shouldDivideValuesCorrectly() {
      int[] dividends = new int[]{10, 20, 30};
      int[] divisors = new int[]{10, 2, 5};

      int[] quotients = Divider.divide(dividends, divisors);
      assertArrayEquals(new int[]{1, 10, 6}, quotients);
   }

   @Test
   void shouldDivideZeroCorrectly() {
      int[] dividends = new int[]{0, 6};
      int[] divisors = new int[]{10, 2};

      int[] quotients = Divider.divide(dividends, divisors);
      assertArrayEquals(new int[]{0, 3}, quotients);
   }

   @Test
   void shouldRoundDivisions() {
      int[] dividends = new int[]{5, 1, 1};
      int[] divisors = new int[]{3, 2, 3};

      int[] quotients = Divider.divide(dividends, divisors);
      assertArrayEquals(new int[]{2, 1, 0}, quotients);
   }
}