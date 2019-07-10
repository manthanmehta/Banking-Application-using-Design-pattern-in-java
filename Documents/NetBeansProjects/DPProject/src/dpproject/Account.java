package dpproject;
//POJO == Account
//contains data 
public class Account {    
    String account_no;
    String firstname;
    String lastname;
    String aadhar;
    double balance;
    String UPIid,dob;
    AccountDao accountdao;
    
    Account(String account_no){
        accountdao=new AccountDaoImpl(); 
        firstname=getFirstname();
        lastname=getLastname();
        aadhar=getAadhar();
        balance=getBalance();
        UPIid=getUPIid();
        this.account_no=account_no;
    }
    
    public String getUPIid() {
        return accountdao.getUPIid(account_no);
    }

    public String getFirstname() {
        return accountdao.getFirstName(account_no);
    }

    public void setFirstname(String firstname){
        accountdao.setFirstName(account_no,firstname);
        this.firstname = accountdao.getFirstName(account_no);
    }

    public String getLastname() {
        return accountdao.getLastName(account_no);
    }

    public void setLastname(String lastname) {
        accountdao.setLastName(account_no, lastname);
        this.lastname = accountdao.getLastName(account_no);
    }

    public String getAadhar() {
        return accountdao.getAadhar(account_no);
    }

    public void setAadhar(String aadhar) {
        accountdao.setAadhar(account_no, aadhar);
        this.aadhar = accountdao.getAadhar(account_no);
    }

    public double getBalance() {
        return accountdao.getBalance(account_no);
    }

    public void debitamount(double amountt) {
        double s=accountdao.getBalance(account_no);
        s=s-amountt;
        accountdao.setBalance(account_no,s);
        this.balance = accountdao.getBalance(account_no);
    }
    
    public void creditamount(double amountt){
        double s=accountdao.getBalance(account_no);
        s=s+amountt;
        accountdao.setBalance(account_no,s);
        this.balance = accountdao.getBalance(account_no);
    }
}
