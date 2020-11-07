public class AccountDTO {
    private int account_ID;
    private int accountPassword;
    private String accountName;
    private String phoneNumber;
    private boolean isAdmin;

    public int getAccount_ID() {
        return account_ID;
    }
    public int getAccountPassword() {
        return accountPassword;
    }
    public String getAccountName() {
        return accountName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public boolean isAdmin() {
        return isAdmin;
    }
    public void setAccount_ID(int account_ID) {
        this.account_ID = account_ID;
    }
    public void setAccountPassword(int accountPassword) {
        this.accountPassword = accountPassword;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    public AccountDTO(int account_ID, int accountPassword, String accountName, String phoneNumber, boolean isAdmin) {
        super();
        this.account_ID = account_ID;
        this.accountPassword = accountPassword;
        this.accountName = accountName;
        this.phoneNumber = phoneNumber;
        this.isAdmin = isAdmin;
    }
    @Override
    public String toString() {
        return "AccountDTO [account_ID=" + account_ID + ", accountPassword=" + accountPassword + ", accountName="
                + accountName + ", phoneNumber=" + phoneNumber + ", isAdmin=" + isAdmin + "]";
    }
}