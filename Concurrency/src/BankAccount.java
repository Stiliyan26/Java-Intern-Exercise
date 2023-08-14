import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private double balance;
    private String accountNumber;

    private Lock lock;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        lock = new ReentrantLock();
    }
    //Way 1

//    public synchronized void deposit(double amount) {
//        balance += amount;
//    }
//
//    public synchronized void withdraw(double amount) {
//        balance -= amount;
//    }

    //Way 2
//    public void deposit(double amount) {
//        synchronized (this){
//            balance += amount;
//        }
//    }
//
//    public void withdraw(double amount) {
//        synchronized (this){
//            balance -= amount;
//        }
//    }

    //    public synchronized void deposit(double amount) {
//        balance += amount;
//    }
//
//    public synchronized void withdraw(double amount) {
//        balance -= amount;
//    }

    //Way 3
//    public void deposit(double amount) {
//        lock.lock();
//        try {
//            balance += amount;
//
//        } finally {
//            lock.unlock();
//        }
//    }
//
//    public void withdraw(double amount) {
//        lock.lock();
//        try {
//            balance -= amount;
//
//        } finally {
//            lock.unlock();
//        }
//    }

    public void deposit(double amount) {
        boolean status = false;

        try {
            if (lock.tryLock(1000, TimeUnit.MICROSECONDS)){
                try {
                    balance += amount;
                    status = true;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Could not get the lock!");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Transaction status = " + status);
    }

    public void withdraw(double amount) {
        boolean status = false;
        try {
            if (lock.tryLock(1000, TimeUnit.MICROSECONDS)){
                try {
                    balance -= amount;
                    status = true;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Could not get the lock!");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Transaction status = " + status);
    }
        public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber(){
        System.out.println("Account number = " + accountNumber);
    }
}