
package dpproject;

public interface AccountDao {
     public String getFirstName(String accountno);
     public String getLastName(String accountno);
     public double getBalance(String accountno);
     public String getUPIid(String accountno);
     public String getAadhar(String accountno);
     public String getaccount(String upiid);
     public void setFirstName(String accountno,String firstname);
     public void setLastName(String accountno,String lastname);
     public void setAadhar(String accountno,String aadhar);
     public void setBalance(String accountno,double amount);
}
