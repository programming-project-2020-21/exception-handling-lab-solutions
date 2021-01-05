package ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

   @Test
   void shouldParseArrayOfIntegers() {
      int[] parsedValues = Parser.parseToInt(new String[]{"1", "2", "3"});
      assertArrayEquals(new int[]{1, 2, 3}, parsedValues);
   }

   @Test
   void shouldParseArrayOfNegativeIntegers() {
      int[] parsedValues = Parser.parseToInt(new String[]{"-10", "-20"});
      assertArrayEquals(new int[]{-10, -20}, parsedValues);
   }

   @Test
   void shouldFailOnArrayOfFloats() {
      assertThrows(IllegalArgumentException.class, () -> {
         Parser.parseToInt(new String[]{"5.2", "9.3"});
      });
   }

   @Test
   void shouldFailOnArrayOfWords() {
      assertThrows(IllegalArgumentException.class, () -> {
         Parser.parseToInt(new String[]{"One", "Two", "Three", "Four"});
      });
   }

   @Test
   void shouldChainExceptions() {
      try {
         Parser.parseToInt(new String[]{"One", "Two"});
      } catch (Exception e) {
         Throwable cause = e.getCause();
         assertNotNull(cause);
      }
   }

}