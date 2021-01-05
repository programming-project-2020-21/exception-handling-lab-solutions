package ex5;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
   final PrintStream originalOut = System.out;
   final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

   @BeforeEach
   void setUp(){
      System.setOut(new PrintStream(outContent));
   }

   @AfterEach
   void tearDown() {
      System.setOut(originalOut);
   }

   @Test
   void shouldIncreaseBalanceWhenDepositing() throws InvalidDepositException {
      BankAccount account = new BankAccount(100);
      account.deposit(50);
      assertEquals(150, account.getBalance());
   }

   @Test
   void shouldFailWhenDepositingNothing() {
      BankAccount account = new BankAccount(20);
      assertThrows(InvalidDepositException.class, () -> {
         account.deposit(0);
      });
   }

   @Test
   void shouldFailWhenDepositingNegativeAmount() {
      BankAccount account = new BankAccount(100);
      assertThrows(InvalidDepositException.class, () -> {
         account.deposit(-100);
      });
   }

   @Test
   void shouldDecreaseBalanceWhenWithdrawing() throws Exception {
      BankAccount account = new BankAccount(500);
      account.withdraw(200);
      assertEquals(300, account.getBalance());
   }

   @Test
   void shouldBeAbleToWithdrawEverything() throws Exception {
      BankAccount account = new BankAccount(100);
      account.withdraw(100);
      assertEquals(0, account.getBalance());
   }

   @Test
   void shouldFailWhenWithdrawingNothing() throws Exception {
      BankAccount account = new BankAccount(500);
      assertThrows(InvalidWithdrawException.class, () -> {
         account.withdraw(0);
      });
   }

   @Test
   void shouldFailWhenWithdrawingNegativeAmount() throws Exception {
      BankAccount account = new BankAccount(500);
      assertThrows(InvalidWithdrawException.class, () -> {
         account.withdraw(-100);
      });
   }

   @Test
   void shouldFailWhenWithdrawingMoreThanBalance() throws Exception {
      BankAccount account = new BankAccount(5);
      assertThrows(InsufficientFundsException.class, () -> {
         account.withdraw(10);
      });
   }

   @Test
   void insuficientFundsExceptionShouldMentionExceededAmount() throws Exception {
      BankAccount account = new BankAccount(10);
      try {
         account.withdraw(11);
      } catch (InsufficientFundsException exception) {
         assertTrue(exception.getMessage().contains("1"));
      }
   }

   @Test
   void invalidWithdrawExceptionShouldMentionInvalidAmount() throws Exception {
      BankAccount account = new BankAccount(10);
      try {
         account.withdraw(-50);
      } catch (InvalidWithdrawException exception) {
         assertTrue(exception.getMessage().contains("-50"));
      }
   }

   @Test
   void invalidDepositExceptionShouldMentionInvalidAmount() {
      BankAccount account = new BankAccount(10);
      try {
         account.deposit(0);
      } catch (InvalidDepositException exception) {
         assertTrue(exception.getMessage().contains("0"));
      }
   }

   @Test
   void shouldRunValidOperationsWithInts() {
      BankAccount account = new BankAccount(100);
      String[] operations = new String[]{"w;5", "w;10", "d;100"};
      account.runBatchOperations(operations);
      assertEquals(185, account.getBalance() );
   }

   @Test
   void shouldRunValidOperationsWithFloats() {
      BankAccount account = new BankAccount(100);
      String[] operations = new String[]{"w;5.1", "w;10.2", "d;100.1"};
      account.runBatchOperations(operations);
      assertEquals(184.8, account.getBalance());
   }

   @Test
   void shouldSkipInvalidOperations() {
      BankAccount account = new BankAccount(100);
      String[] operations = new String[]{"w;-5", "w;-10", "d;100"};
      account.runBatchOperations(operations);
      assertEquals(200, account.getBalance());
   }

   @Test
   void shouldPrintInvalidOperationsOnConsole() {
      BankAccount account = new BankAccount(100);
      String[] operations = new String[]{"w;-5", "w;-10", "w;200"};
      account.runBatchOperations(operations);
      assertTrue(outContent.toString().contains("-5"));
      assertTrue(outContent.toString().contains("-10"));
      assertTrue(outContent.toString().contains("100"));
   }

   @Test
   void shouldFailOnUnknownOperation() {
      BankAccount account = new BankAccount(100);
      String[] operations = new String[]{"w;5", "f;10", "d;10"};
      assertThrows(Exception.class, () -> {
         account.runBatchOperations(operations);
      });
   }

   @Test
   void shouldFailOnBadFormat() {
      BankAccount account = new BankAccount(100);
      String[] operations = new String[]{"w5", "f10", "d10"};
      assertThrows(Exception.class, () -> {
         account.runBatchOperations(operations);
      });
   }

}