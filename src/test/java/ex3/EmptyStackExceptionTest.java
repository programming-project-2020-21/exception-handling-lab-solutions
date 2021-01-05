package ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmptyStackExceptionTest {

   @Test
   void shouldHaveCustomMessageOnPop() {
      MyStack stack = new MyStack(5);
      try {
         stack.pop();
      } catch (Exception e) {
         assertEquals(e.getMessage(),"Cannot perform operation. The stack is empty!");
      }
   }

   @Test
   void shouldHaveCustomMessageOnPeek() {
      MyStack stack = new MyStack(5);
      try {
         stack.peek();
      } catch (Exception e) {
         assertEquals(e.getMessage(),"Cannot perform operation. The stack is empty!");
      }
   }
}