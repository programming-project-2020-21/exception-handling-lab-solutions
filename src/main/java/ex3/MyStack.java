package ex3;

import java.util.Arrays;

public class MyStack {

   private int[] array;
   private int top;

   public MyStack(int maxSize) {
      this.array = new int[maxSize];
      this.top = 0;
   }

   public boolean isEmpty() {
      return top == 0;
   }

   public boolean isFull() {
      return top == getMaxSize();
   }

   public int getSize() {
      return this.top;
   }

   public int getMaxSize() {
      return this.array.length;
   }

   public boolean push(int value) {
      if (isFull())
         throw new FullStackException(getMaxSize(), value);

      array[top] = value;
      top++;
      return true;
   }

   public int pop() {
      if (isEmpty())
         throw new EmptyStackException();

      top--;
      int lastAddedValue = array[top];
      return lastAddedValue;
   }

   public int peek() {
      if (isEmpty())
         throw new EmptyStackException();

      return array[top - 1];
   }

   @Override
   public String toString() {
      return Arrays.toString(Arrays.copyOfRange(array,0,top));
   }
}
