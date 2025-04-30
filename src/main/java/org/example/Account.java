package org.example;

public class Account {
    private AccountStatus status;
    private String accountId;
    private String password;

    public Account(String accountId, String password) {
        this.accountId = accountId;
        this.password = password;
        this.status = AccountStatus.ACTIVE;
    }

    // Getters and setters
    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Business method
    public boolean resetPassword(String newPassword) {
        if (newPassword == null || newPassword.isEmpty()) return false;
        this.password = newPassword;
        return true;
    }
}

