package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactionsTable;
    private int transactionsCount;

    public CashMachine() {
        this.transactionsTable = new int[0];
        this.transactionsCount = 0;
    }

    public void addTransactions(int amount) {
        this.transactionsCount ++;
        int[] newTab = new int[this.transactionsCount];
        System.arraycopy(transactionsTable, 0, newTab,0, transactionsTable.length);
        newTab[this.transactionsCount - 1] = amount;
        this.transactionsTable = newTab;
    }
    public int[] getTransactionsTable(){
        return transactionsTable;
    }

    public int getBalance() {
        int balance = 0;
        for (int i = 0; i < transactionsCount; i++) {
            balance += transactionsTable[i];
        }
        return balance;
    }
    public int getWithdrawCount(){
        int withdrawCount = 0;
        for (int i = 0; i < transactionsCount; i++){
            if (transactionsTable[i] < 0) {
                withdrawCount ++;
            }
        }
        return withdrawCount;
    }
    public double getDepositCount(){
        int depositCount = 0;
        for (int i = 0; i < transactionsCount; i++){
            if (transactionsTable[i] > 0) {
                depositCount ++;
            }
        }
        return depositCount;
}

    public double getAverageDeposit(){
        int depositCount = 0;
        int depositSum = 0;
        double averDeposit = 0;
        for (int i = 0; i < transactionsCount; i++){
            if (transactionsTable[i] > 0) {
                depositCount++;
                depositSum += transactionsTable[i];
            }
        }
        if (depositCount != 0) {
            averDeposit = (double) depositSum / depositCount;
        }
        return averDeposit;
    }



}
