import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MyStackTest {
   MyStack stack;

   @Test
   void shouldBeCreatedEmpty() {
      stack = new MyStack(1);
      assertEquals(stack.getSize(),0);
   }

   @Test
   void shouldIncreaseSizeWhenPushing() {
      stack = new MyStack(1);
      stack.push(5);
      assertEquals(stack.getSize(),1);
   }

   @Test
   void shouldShowTopElementWhenPeeking() {
      stack = new MyStack(1);
      stack.push(5);
      assertEquals(stack.peek(),5);
   }

   @Test
   void shouldRejectPushWhenFull() {
      stack = new MyStack(1);
      stack.push(5);
      var pushSucceeded = stack.push(10);
      assertFalse(pushSucceeded);
   }


}
