package org.OOPS;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class TransactionManagerTest {
    @Test
    public void testMakeTransactionSufficientFunds() {
        BankAccount sender = new BankAccount("123456", 1000);
        BankAccount receiver = new BankAccount("789101", 500);
        TransactionManager transactionManager = new TransactionManager(sender, receiver);
        assertTrue(transactionManager.makeTransaction(300));
        assertEquals(700, sender.getBalance());
        assertEquals(800, receiver.getBalance());
    }

    @Test
    public void testMakeTransactionInsufficientFunds() {
        BankAccount sender = new BankAccount("123456", 1000);
        BankAccount receiver = new BankAccount("789101", 500);
        TransactionManager transactionManager = new TransactionManager(sender, receiver);
        assertFalse(transactionManager.makeTransaction(1500));
        assertEquals(1000, sender.getBalance());
        assertEquals(500, receiver.getBalance());
    }
}
