package ex5;

public class BankAccount {
   private double balance;

   public BankAccount(double amount) {
      this.balance = amount;
   }

   public double getBalance() {
      return balance;
   }

   public void deposit(double amount) throws InvalidDepositException {
      if (amount <= 0)
         throw new InvalidDepositException(amount);

      balance += amount;
   }

   public void withdraw(double amount) throws InsufficientFundsException, InvalidWithdrawException {
      if (amount <= 0)
         throw new InvalidWithdrawException(amount);

      if (amount > balance) {
         double needs = amount - balance;
         throw new InsufficientFundsException(needs);
      }

      balance -= amount;
   }

   public void runBatchOperations(String[] operations) {
      for (String operation : operations) {
         try {
            String[] components = operation.split(";");
            String type = components[0];
            double amount = Double.parseDouble(components[1]);

            switch (type) {
               case "w":
                  this.withdraw(amount);
                  break;
               case "d":
                  this.deposit(amount);
                  break;
               default:
                  throw new IllegalStateException("Unexpected value: " + type);
            }
         } catch (InvalidWithdrawException | InvalidDepositException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
         } catch (Exception e) {
            throw e;
         }
      }
   }

}