package dk.entities;

public class Account {
    private int accountId;
    private double balance;
    private int userId;

    public Account(int accountId, double balance, int userId) {
        this.accountId = accountId;
        this.balance = balance;
        this.userId = userId;
    }
}
