
package dpproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {
    
    String accountno;
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    boolean flag=false;
    public String getAccountNo(String username,String password){
        flag=false;
        accountno=null;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/FEDERAL BANK","amigo","amigo");
            stmt=(Statement)conn.createStatement();
            String query="SELECT * FROM LOGINDETAILS WHERE USERNAME='"+username+"'"+"AND PASSWORD='"+password+"'";
            rs=stmt.executeQuery(query);
            while(rs.next()){
                 accountno=rs.getString(3);
            } 
        }
        catch (ClassNotFoundException ex){
            System.out.println(ex);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
            return accountno;
    }
}