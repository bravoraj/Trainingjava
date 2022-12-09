package ThreadConceptTest;


public class BankAccount implements Runnable {

    Account acc = new Account();
    public static void main(String[] args) {
        BankAccount T1 = new BankAccount();
        Thread t1 = new Thread(T1, "RAJKUMAR");
        Thread t2 = new Thread(T1, "PRIYA");
        Thread t3 = new Thread(T1, "NAVEEN");
        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 1; i++) {
            makeWithdraw(1000);
            if (acc.getBal() < 0) {
                System.out.println("account is overdraft");
            }
            deposit(500);
        }
    }


    private synchronized void makeWithdraw(int bal) {
        if (acc.getBal() >= bal) {
            System.out.println(Thread.currentThread().getName() + " " + "try to withdraw");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            acc.withdraw(bal);
            System.out.println(Thread.currentThread().getName() + " " + "complete the withdraw");
        } else {
            System.out.println(Thread.currentThread().getName() + " " + "doesn't have enough money for withdraw ");
        }
    }

    private synchronized void deposit(int bal) {
        if (bal > 0) {
            System.out.println(Thread.currentThread().getName() + " " + "try to deposit");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            acc.deposit(bal);
            System.out.println(Thread.currentThread().getName() + " " + "complete the deposit");
        } else {
            System.out.println(Thread.currentThread().getName() + " " + "doesn't have enough money for deposit");
        }
    }
    public boolean closeAccount() {
        int bal = 0;
        if (acc != null && bal >= 0) {
                return true;
            }
            return false;

    }
}

