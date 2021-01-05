package ex5;

public class InvalidDepositException extends Exception {
   double amount;

   public InvalidDepositException(double amount) {
      this.amount = amount;
   }

   @Override
   public String getMessage() {
      return "Cannot deposit € "+amount+". The deposited amount should be a positive number.";
   }
}
