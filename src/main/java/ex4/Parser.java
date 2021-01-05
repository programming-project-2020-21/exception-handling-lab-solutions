package ex4;

public class Parser {

   public static int[] parseToInt(String[] values) {
      int[] integers = new int[values.length];

      for (int i = 0; i < values.length; i++) {
         try {
            integers[i] = Integer.parseInt(values[i]);
         }
         catch (NumberFormatException exception) {
            throw new IllegalArgumentException("Input array should contain only integers", exception);
         }
      }

      return integers;
   }

}
