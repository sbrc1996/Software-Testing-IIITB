package org.OOPS;

public class TransactionManager {
    private BankAccount sender;
    private BankAccount receiver;

    public TransactionManager(BankAccount sender, BankAccount receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    public boolean makeTransaction(int amount) {
        if (sender.withdraw(amount)) {
            receiver.deposit(amount);
            return true;
        }
        return false;
    }

}