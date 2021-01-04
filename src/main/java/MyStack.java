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

   public boolean push(int value) throws FullStackException {
      if (isFull())
         throw new FullStackException(getMaxSize(), value);

      array[top] = value;
      top++;
      return true;
   }

   public int pop() throws EmptyStackException {
      if (isEmpty())
         throw new EmptyStackException();

      top--;
      int lastAddedValue = array[top];
      return lastAddedValue;
   }

   public int peek() throws EmptyStackException {
      if (isEmpty())
         throw new EmptyStackException();

      return array[top - 1];
   }

   @Override
   public String toString() {
      return "Size: " + array.length + "\n" +
              "Top: " + top + "\n" +
              "Contents: " + Arrays.toString(array);
   }
}
