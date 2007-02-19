/**
 * AccountDataBean.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * o0526.04 v62905175048
 */

package org.apache.geronimo.samples.daytrader;

public class AccountDataBean  {
    private java.lang.Integer accountID;
    private int loginCount;
    private int logoutCount;
    private java.util.Calendar lastLogin;
    private java.util.Calendar creationDate;
    private java.math.BigDecimal balance;
    private java.math.BigDecimal openBalance;
    private java.lang.String profileID;

    public AccountDataBean() {
    }

    public java.lang.Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(java.lang.Integer accountID) {
        this.accountID = accountID;
    }

    public int getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(int loginCount) {
        this.loginCount = loginCount;
    }

    public int getLogoutCount() {
        return logoutCount;
    }

    public void setLogoutCount(int logoutCount) {
        this.logoutCount = logoutCount;
    }

    public java.util.Calendar getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(java.util.Calendar lastLogin) {
        this.lastLogin = lastLogin;
    }

    public java.util.Calendar getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }

    public java.math.BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(java.math.BigDecimal balance) {
        this.balance = balance;
    }

    public java.math.BigDecimal getOpenBalance() {
        return openBalance;
    }

    public void setOpenBalance(java.math.BigDecimal openBalance) {
        this.openBalance = openBalance;
    }

    public java.lang.String getProfileID() {
        return profileID;
    }

    public void setProfileID(java.lang.String profileID) {
        this.profileID = profileID;
    }

}