package ex5;

public class InvalidWithdrawException extends Exception {
   double amount;

   public InvalidWithdrawException(double amount) {
      this.amount = amount;
   }

   @Override
   public String getMessage() {
      return "Cannot withdraw € "+amount+". The withdrawn amount should be a positive number.";
   }
}
