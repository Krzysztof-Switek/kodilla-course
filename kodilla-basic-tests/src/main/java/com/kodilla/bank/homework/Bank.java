package com.kodilla.bank.homework;

import com.kodilla.bank.homework.CashMachine;

public class Bank {

    private CashMachine[] cashMachinesTable;

    public static void main(String[] args) {

    }
    public Bank(CashMachine[] cashMachinesTable) {
        this.cashMachinesTable = cashMachinesTable;
    }

    public int getTotalBalance() {
        int totalBalance = 0;
        for (CashMachine cashMachine : cashMachinesTable) {
            totalBalance += cashMachine.getBalance();
        }
        return totalBalance;
    }

    public int getTotalWithdrawCount() {
        int totalWithdraws = 0;
        for (CashMachine cashMachine : cashMachinesTable) {
            totalWithdraws += cashMachine.getWithdrawCount();
        }
        return totalWithdraws;
    }

//    public double averDepositsAllCashMachines() {
//        double averWithdraw = 0;
//
//        for (CashMachine cashMachine : cashMachinesTable) {
//            averWithdraw = cashMachine.getAverageDeposit() / cashMachinesTable.length;
//        }
//        return averWithdraw;
    }




