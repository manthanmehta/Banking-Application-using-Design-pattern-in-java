
package dpproject;

import java.util.Scanner;

public class LoginView {
   String username,password;
   String accountno;
   LoginDetails ld;
   
   LoginView(LoginDetails ld){
       this.ld=ld;
       while(true){
       Scanner scanner=new Scanner(System.in); 
       System.out.println("=================================");
       System.out.println("Federal Bnak");
       System.out.println("=================================");
       System.out.println("Enter Username");
       username=scanner.next();
       System.out.println("Enter Password");
       password=scanner.next();
       Boolean flag=ld.validateUser(username,password);
       if(flag){
           accountno=ld.getaccountno();
           break;
       }
       else{
           System.out.println("Please Enter Correct Username and Password");
        } 
      }   
}
   
   public String getAccountNo(){
       return accountno;
   }
}
