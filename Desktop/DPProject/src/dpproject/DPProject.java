package dpproject;

import java.util.Scanner;

public class DPProject {

    public static void main(String[] args) {
        String accountno;
        LoginDetails ld=new LoginDetails();
        LoginView x=new LoginView(ld);
        accountno=x.getAccountNo();
        Account acc=new Account(accountno);
        MyAccountView mav=new MyAccountView();
        AccountController ac=new AccountController(acc,mav); 
        
    }    
}
