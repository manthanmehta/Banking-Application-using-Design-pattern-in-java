package dpproject;

public class LoginDetails {
    
    String username;
    String password;
    String accountno;
    
    boolean validateUser(String username,String password){
        LoginDAO x=new LoginDAO();
        accountno=x.getAccountNo(username,password);
        return accountno != null;
    }
    
    public String getaccountno(){
        return accountno;
    }
}
