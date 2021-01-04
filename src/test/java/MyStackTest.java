import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

   @Test
   void shouldBeCreatedEmpty() {
      MyStack stack = new MyStack(10);
      assertEquals(stack.getSize(), 0);
   }

   @Test
   void shouldKeepInsertionOrder() {
      MyStack stack = new MyStack(3);
      stack.push(10);
      stack.push(20);
      stack.push(30);
      assertEquals(stack.pop(),30);
      assertEquals(stack.pop(),20);
      assertEquals(stack.pop(),10);
   }

   @Test
   void shouldIncreaseSizeWhenPushing() {
      MyStack stack = new MyStack(1);
      stack.push(5);
      assertEquals(stack.getSize(), 1);
   }

   @Test
   void shouldDecreaseSizeWhenPopping() {
      MyStack stack = new MyStack(2);
      stack.push(10);
      stack.push(20);
      assertEquals(stack.getSize(), 2);
      stack.pop();
      assertEquals(stack.getSize(), 1);
   }

   @Test
   void shouldShowTopElementWhenPeeking() {
      MyStack stack = new MyStack(1);
      stack.push(5);
      assertEquals(stack.peek(), 5);
   }

   @Test
   void shouldThrowExceptionWhenPushingToFullStack() {
      MyStack stack = new MyStack(2);
      stack.push(5);
      stack.push(10);
      assertThrows(FullStackException.class, () -> {
         stack.push(15);
      });
   }

   @Test
   void shouldThrowExceptionWhenPoppingEmptyStack() {
      MyStack stack = new MyStack(5);
      assertThrows(EmptyStackException.class, stack::pop);
   }

   @Test
   void shouldThrowExceptionWhenPeekingEmptyStack() {
      MyStack stack = new MyStack(5);
      assertThrows(EmptyStackException.class, stack::peek);
   }


}
