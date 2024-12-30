package w4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), "Deposit of 100.0 should increase the balance to 100.0");
    }

    @Test
    public void testWithdrawSuccess() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        boolean success = account.withdraw(50.0);
        assertTrue(success, "Withdrawal of 50.0 should succeed");
        assertEquals(50.0, account.getBalance(), "Balance should decrease to 50.0 after withdrawal of 50.0");
    }

    @Test
    public void testWithdrawFailure() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        account.withdraw(50.0);
        boolean success = account.withdraw(60.0);
        assertFalse(success, "Withdrawal of 60.0 should fail when balance is 50.0");
        assertEquals(50.0, account.getBalance(), "Balance should remain 50.0 after failed withdrawal");
    }
}

