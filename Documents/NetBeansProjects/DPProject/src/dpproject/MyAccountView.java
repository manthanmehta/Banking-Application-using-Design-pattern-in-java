
package dpproject;

public class MyAccountView{
       
    public void view(String accountno,String firstname,String lastname,String aadhar,double balance,String upiid){
        System.out.println("Account No:"+accountno);
        System.out.println("First Name:"+firstname);
        System.out.println("Last Name:"+lastname);
        System.out.println("Aadhar"+aadhar);
        System.out.println("Balance"+balance);
        System.out.println("UPIid"+upiid);
    }         
}