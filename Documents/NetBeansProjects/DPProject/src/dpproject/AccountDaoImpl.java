package dpproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDaoImpl implements AccountDao{

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
   
    @Override
    public String getFirstName(String accountno) {
        String firstname=null;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/FEDERAL BANK","amigo","amigo");
            stmt=(Statement)conn.createStatement();
            String query="SELECT * FROM ACCOUNTS WHERE ACCOUNTNO='"+accountno+"'";
            rs=stmt.executeQuery(query);
            while(rs.next()){
                firstname=rs.getString(2);
            } 
        }
        catch (ClassNotFoundException ex){
            System.out.println(ex);
        }catch (SQLException ex){
            ex.printStackTrace();
        }  
        return firstname;
    }

    @Override
    public String getLastName(String accountno) {
        String lastname=null;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/FEDERAL BANK","amigo","amigo");
            stmt=(Statement)conn.createStatement();
            String query="SELECT * FROM ACCOUNTS WHERE ACCOUNTNO='"+accountno+"'";
            rs=stmt.executeQuery(query);
            while(rs.next()){
                lastname=rs.getString(3);
            } 
        }
        catch (ClassNotFoundException ex){
            System.out.println(ex);
        }catch (SQLException ex){
            ex.printStackTrace();
        }  
        return lastname;
    }

    @Override
    public double getBalance(String accountno) {
         double balance=0;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/FEDERAL BANK","amigo","amigo");
            stmt=(Statement)conn.createStatement();
            String query="SELECT * FROM ACCOUNTS WHERE ACCOUNTNO='"+accountno+"'";
            rs=stmt.executeQuery(query);
            while(rs.next()){
                balance=rs.getDouble(3);
            } 
        }
        catch (ClassNotFoundException ex){
            System.out.println(ex);
        }catch (SQLException ex){
            ex.printStackTrace();
        }  
        return balance;
    }

    @Override
    public String getUPIid(String accountno) {
        String upi=null;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/FEDERAL BANK","amigo","amigo");
            stmt=(Statement)conn.createStatement();
            String query="SELECT * FROM ACCOUNTS WHERE ACCOUNTNO='"+accountno+"'";
            rs=stmt.executeQuery(query);
            while(rs.next()){
                upi=rs.getString(7);
            } 
        }
        catch (ClassNotFoundException ex){
            System.out.println(ex);
        }catch (SQLException ex){
            ex.printStackTrace();
        }  
        return upi;
    }

    @Override
    public String getAadhar(String accountno) {
        String aadhar=null;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/FEDERAL BANK","amigo","amigo");
            stmt=(Statement)conn.createStatement();
            String query="SELECT * FROM ACCOUNTS WHERE ACCOUNTNO='"+accountno+"'";
            rs=stmt.executeQuery(query);
            while(rs.next()){
                aadhar=rs.getString(6);
            } 
        }
        catch (ClassNotFoundException ex){
            System.out.println(ex);
        }catch (SQLException ex){
            ex.printStackTrace();
        }  
        return aadhar;
    }

    @Override
    public void setAadhar(String accountno,String aadhar) {
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/FEDERAL BANK","amigo","amigo");
            stmt=(Statement)conn.createStatement();
            String query="UPDATE ACCOUNTS SET AADHAR='"+aadhar+"' WHERE ACCOUNTNO='"+accountno+"'";
            stmt.executeUpdate(query);
        }
        catch (ClassNotFoundException ex){
            System.out.println(ex);
        }catch (SQLException ex){
            ex.printStackTrace();
        }  
    }

    @Override
    public void setBalance(String accountno,double amount){
         try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/FEDERAL BANK","amigo","amigo");
            stmt=(Statement)conn.createStatement();
            String query="UPDATE ACCOUNTS SET BALANCE='"+amount+"' WHERE ACCOUNTNO='"+accountno+"'";
            stmt.executeUpdate(query);
        }
        catch (ClassNotFoundException ex){
            System.out.println(ex);
        }catch (SQLException ex){
            ex.printStackTrace();
        } 
    }
    
    @Override
    public String getaccount(String upiid) {
        String account=null;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/FEDERAL BANK","amigo","amigo");
            stmt=(Statement)conn.createStatement();
            String query="SELECT * FROM ACCOUNTS WHERE UPIID='"+upiid+"'";
            rs=stmt.executeQuery(query);
            while(rs.next()){
                account=rs.getString(1);
            } 
        }
        catch (ClassNotFoundException ex){
            System.out.println(ex);
        }catch (SQLException ex){
            ex.printStackTrace();
        }  
        return account;
    }

    @Override
    public void setFirstName(String accountno, String firstname) {
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/FEDERAL BANK","amigo","amigo");
            stmt=(Statement)conn.createStatement();
            String query="UPDATE ACCOUNTS SET FIRSTNAME='"+firstname+"' WHERE ACCOUNTNO='"+accountno+"'";
            stmt.executeUpdate(query);
        }
        catch (ClassNotFoundException ex){
            System.out.println(ex);
        }catch (SQLException ex){
            ex.printStackTrace();
        }  
    }

    @Override
    public void setLastName(String accountno, String lastname) {
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/FEDERAL BANK","amigo","amigo");
            stmt=(Statement)conn.createStatement();
            String query="UPDATE ACCOUNTS SET LASTNAME='"+lastname+"' WHERE ACCOUNTNO='"+accountno+"'";
            stmt.executeUpdate(query);
        }
        catch (ClassNotFoundException ex){
            System.out.println(ex);
        }catch (SQLException ex){
            ex.printStackTrace();
        }  
    }
}
