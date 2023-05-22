package com.kodilla.basic_assertion.bank.homework;
import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int [] transactionsTable = cashMachine.getTransactionsTable();
        assertEquals(0, transactionsTable.length);
    }
    @Test
    public void shouldAddTwoDepositsToCashMachine() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransactions(200);
        cashMachine.addTransactions(100);
        int[] transactionsTable  = cashMachine.getTransactionsTable();
        assertEquals(2,transactionsTable.length);
        assertEquals(200,transactionsTable[0]);
        assertEquals(100,transactionsTable[1]);
    }

    @Test
    public void shouldAddTwoWithdrawsToCashMachine() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransactions(-50);
        cashMachine.addTransactions(-70);
        int[] transactionsTable  = cashMachine.getTransactionsTable();
        assertEquals(2,transactionsTable.length);
        assertEquals(-50,transactionsTable[0]);
        assertEquals(-70,transactionsTable[1]);
    }

    @Test
    public void shouldCalculateTotalBalance() {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransactions(-50);
        cashMachine1.addTransactions(-70);
        cashMachine1.addTransactions(200);
        cashMachine1.addTransactions(100);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransactions(300);
        cashMachine2.addTransactions(-100);
        cashMachine2.addTransactions(-50);

        CashMachine cashMachine3 = new CashMachine();
        cashMachine2.addTransactions(400);
        cashMachine2.addTransactions(-500);
        cashMachine2.addTransactions(-50);

        CashMachine[] cashMachinesTable = {cashMachine1, cashMachine2, cashMachine3};
        Bank bank = new Bank(cashMachinesTable);
        int totalWithdrawCount = bank.getTotalWithdrawCount();
        assertEquals(6, totalWithdrawCount);
      //  assertEquals(136.6,bank.averDepositsAllCashMachines(), 0.1);
        int[] transactionsTable  = cashMachine1.getTransactionsTable();
        assertEquals(4,transactionsTable.length);
        assertEquals(180,cashMachine1.getBalance(), 0.1 );

    }
    @Test
    public void shouldAddCashMachines(){


    }


}
