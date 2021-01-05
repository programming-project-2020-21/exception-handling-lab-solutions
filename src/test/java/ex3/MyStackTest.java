package ex3;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

   @Test
   void shouldBeCreatedEmpty() {
      MyStack stack = new MyStack(10);
      assertEquals(stack.getSize(), 0);
   }

   @Test
   void shouldBehaveAsLifoPushThenPop() {
      MyStack stack = new MyStack(3);
      stack.push(10);
      stack.push(20);
      stack.push(30);
      assertEquals(stack.pop(),30);
      assertEquals(stack.pop(),20);
      assertEquals(stack.pop(),10);
   }

   @Test
   void shouldBehaveAsLifoPushPopInterleaved() {
      MyStack stack = new MyStack(3);
      stack.push(10);
      stack.push(20);
      assertEquals(stack.pop(),20);
      stack.push(30);
      assertEquals(stack.pop(),30);
      stack.push(40);
      assertEquals(stack.pop(),40);
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
   void shouldShowLastAddedElementWhenPeeking1Push() {
      MyStack stack = new MyStack(1);
      stack.push(5);
      assertEquals(stack.peek(), 5);
   }

   @Test
   void shouldShowLastAddedElementWhenPeeking3Pushes() {
      MyStack stack = new MyStack(4);
      stack.push(5);
      stack.push(10);
      stack.push(15);
      assertEquals(stack.peek(), 15);
   }

   @Test
   void shouldShowLastAddedElementWhenPeekingPushAndPop() {
      MyStack stack = new MyStack(4);
      stack.push(5);
      stack.push(10);
      stack.push(15);
      stack.pop();
      assertEquals(stack.peek(), 10);
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
      MyStack stack = new MyStack(7);
      assertThrows(EmptyStackException.class, stack::peek);
   }


}
