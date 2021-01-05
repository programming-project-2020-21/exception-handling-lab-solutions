## Exercise 5: Catching multiple exception types

Complete the implementation of the [`BankAccount`](BankAccount.java) class according to the instructions below:

- `BankAccount(double amount)`: initializes the account with an initial balance

- `getBalance()`: returns the current balance in the account
  
- `deposit(double amount)`: increases the balance in the account. If the deposited amount is not positive, an `InvalidDepositException` should be thrown.

- `withdraw(double amount)`: decreases the balance in the account. If the withdrawn amount is not positive, an `InvalidWithdrawException` should be thrown. If the it is more than the current account balance, an `InsufficientFundsException` should be thrown.

- Instances of `InvalidWithdrawException` and `InvalidDepositException` should mention the invalid amount in their messages.

- Instances of `InsufficientFundsException` should display the amount that exceeded the balance.

- `runBatchOperations(String[] operations)` should process the operations defined in the input array following the regular expression `[w|d];-?\d+(\.\d+)?`, i.e. a `w` or `d` followed by a semicolon (`;`), followed by a number;
 
    - "w;10" means withdraw € 10 from the account
    - "d;5.5" means deposit € 5.5 in the account 

- `runBatchOperations()` should fail if at least one operation in the array is not formatted according to the aforementioned convention.

- `runBatchOperations()` should not fail if `InsufficientFundsException`, `InvalidWithdrawException` or `InvalidDepositException` exceptions are thrown. Instead, it should write their messages in the console.

Usage example:

```java
BankAccount account = new BankAccount(100);
// → balance = 100

account.deposit(50);
// → balance = 150

account.withdrawn(20);
// → balance = 130

account.runBatchOperations(new String[]{"w;5", "w;10", "d;100"})
// → balance = 215
```

Your solution should pass all test cases defined in [`BankAccountTest`](../../../test/java/ex5/BankAccountTest.java).