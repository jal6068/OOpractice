package com;

public class AccountDemo {
    public static void main(String[] args) {
        Account[] accounts = new Account[5];

        accounts[0] = new Account (1, 1, "SA", 10000);
        accounts[1] = new Account (2, 2, "CA", 20000);
        accounts[2] = new Account (3, 1, "SA", 30000);
        accounts[3] = new Account (4, 2, "CA", 40000);
        accounts[4] = new Account (5, 3, "SA", 50000);

        double d = AccountDemo.depositInterest(accounts[0], 10.0);
        System.out.println(d);
        System.out.println(accounts[0].getAccountBalance());

        Account[] acc = AccountDemo.getAccountsForSpecificCustomer(accounts, 2);

        for (Account a: acc) {
            System.out.println(a.getAccountId());
        }
    }

    //method 1
    public static double depositInterest(Account accountId, double interest) {
        accountId.setAccountBalance(accountId.getAccountBalance() * (interest / 100 + 1));
        return accountId.getAccountBalance();
    }

    //method 2
    public static Account[] getAccountsForSpecificCustomer(Account[] accounts, int customerId) {
        int acc = 0;

        for(Account a: accounts) { //enhanced for loop
            if (a.getCustomerId() == customerId) {
                acc++;
            }
        }
        Account[] match = new Account[acc];

        int matchIndex = 0;

        for (Account a: accounts) { //enhanced for loop
            if (a.getCustomerId() == customerId) {
                match[matchIndex] = a;
                matchIndex++;
            }
        }
        return match;
    }
}
