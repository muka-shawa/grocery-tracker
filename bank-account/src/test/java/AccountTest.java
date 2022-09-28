import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    //acctNum, acctType balance
    @Test
    public void shouldHaveAnInitialBalanceOf100(){
        Account underTest = new Account("1234", "Checking", 100);
        //Act
        int initialBalance = underTest.getBalance();
        //Assert
        assertEquals(100, initialBalance);
    }

    @Test
    public void shouldHaveAnInitialBalanceOf200(){
        Account underTest = new Account("1234", "Checking", 200);
        int initialBalance = underTest.getBalance();
        assertEquals(200, initialBalance);
    }

    @Test
    public void shouldMakeAnInitialDepositOf50AndHaveAnEndingBalanceOf150(){
        Account underTest = new Account("1234", "Checking", 100);
        underTest.deposit(50);
        int initialBalance = underTest.getBalance();
        assertEquals(150, initialBalance );
    }

    @Test
    public void shouldMakeAnInitialWithdrawalOf50AndHaveAnEndingBalanceOf50(){
        Account underTest = new Account("1234", "Checking", 100);
        underTest.withdrawal(50);
        int initialBalance = underTest.getBalance();
        assertEquals(50, initialBalance);

    }

    @Test
    public void shouldHaveABalanceOf100AfterWithdrawalAttemptOf101(){
        Account underTest = new Account("1234", "Checking", 100);
        underTest.withdrawal(101);
        int initialBalance = underTest.getBalance();
        assertEquals(100, initialBalance);

    }
}




