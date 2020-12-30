import java.util.Arrays;

public class MyStack {

   private int[] array;
   private int top;

   public MyStack(int maxSize) {
      this.array = new int[maxSize];
      this.top = 0;
   }

   public boolean push(int value) {
      array[top] = value;
      top++;
      return true;
   }

   public int pop() {
      top--;
      int value = array[top];
      return value;
   }

   public int peek() {
      return array[top-1];
   }

   public int getSize() {
      return this.top;
   }

   public int getMaxSize() {
      return this.array.length;
   }

   @Override
   public String toString() {
      return "Size: " + array.length + "\n" +
              "Top: " + top + "\n" +
              "Contents: "+Arrays.toString(array);
   }
}
