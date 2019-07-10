package dpproject;
    
    public class AccountController{
    
    String firstname,lastname,upiid,aadhar;
    double balance;
    Account account;
    MyAccountView accview;
    
    AccountController(Account account,MyAccountView accview){
        this.account=account;
        this.accview=accview;
        firstname=account.getFirstname();
        lastname=account.getLastname();
        aadhar=account.getAadhar();
        upiid=account.getUPIid();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public String getUpiid() {
        return upiid;
    }

    public void setUpiid(String upiid) {
        this.upiid = upiid;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void updateview(){
        accview.view(accountno,firstname,lastname,aadhar,balance,upiid);
    }
}