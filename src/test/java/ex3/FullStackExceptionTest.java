package ex3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FullStackExceptionTest {
   MyStack stack;

   @BeforeEach
   void setUp() {
      stack = new MyStack(2);
      stack.push(10);
      stack.push(20);
   }

   @Test
   void shouldInformElementInMessage() {
      try {
         stack.push(30);
      } catch (Exception e) {
         assertTrue(e.getMessage().contains("Cannot add " + 30 + " to the stack"));
      }
   }

   @Test
   void shouldInformMaxSizeInMessage() {
      try {
         stack.push(30);
      } catch (Exception e) {
         assertTrue(e.getMessage().contains("The stack reached its maximum capacity of " + 2 + "."));
      }
   }

   @Test
   void shouldDisplayCustomMessage() {
      try {
         stack.push(30);
      } catch (Exception e) {
         assertEquals(e.getMessage(), "Cannot add " + 30 + " to the stack. The stack reached its maximum capacity of " + 2 + ".");
      }
   }
}