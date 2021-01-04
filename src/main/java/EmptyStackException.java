public class EmptyStackException extends RuntimeException {


   public EmptyStackException() {
      super();
   }

   public EmptyStackException(String message) {
      super(message);
   }

   public EmptyStackException(String message, Throwable cause) {
      super(message, cause);
   }

   @Override
   public String getMessage() {
      String customMessage = super.getMessage();

      if (customMessage != null)
         return customMessage;

      return "Cannot perform operation. The stack is empty!";
   }
}
