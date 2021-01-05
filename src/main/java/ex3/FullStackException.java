package ex3;

public class FullStackException extends RuntimeException {

   int maxStackSize;
   int element;

   public FullStackException(int maxStackSize, int element) {
      super();
      this.maxStackSize = maxStackSize;
      this.element = element;
   }

   public FullStackException(int maxStackSize, int element, Throwable cause) {
      super(cause);
      this.maxStackSize = maxStackSize;
      this.element = element;
   }

   @Override
   public String getMessage() {
      return "Cannot add " + element + " to the stack. The stack reached its maximum capacity of " + maxStackSize + ".";
   }

}
