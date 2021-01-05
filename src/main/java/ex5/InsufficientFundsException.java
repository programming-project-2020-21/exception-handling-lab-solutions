package ex5;

public class InsufficientFundsException extends Exception {
   double needs;

   public InsufficientFundsException(double needs) {
      this.needs = needs;
   }

   @Override
   public String getMessage() {
      return "Cannot withdraw from account: Request amount exceeds balance by € " + needs + ".";
   }
}
