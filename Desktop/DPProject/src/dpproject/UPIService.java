package dpproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UPIService implements BusinessService{
    
    String senderUPIid;
    String receiverUPIid;
    private String senderaccountno;
    private double amount;
    private String receiveraccountno;
    private AccountDao accountdao;
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    UPIService(){
        accountdao=new AccountDaoImpl();
    }
    
    @Override
    public void doProcessing(){
        double bal;
        senderaccountno=accountdao.getaccount(senderUPIid);
        receiveraccountno=accountdao.getaccount(receiverUPIid);
        bal=accountdao.getBalance(senderaccountno);
        bal=bal-amount;
        accountdao.setBalance(senderaccountno,bal);
        bal=accountdao.getBalance(receiveraccountno);
        bal=bal+amount;
        accountdao.setBalance(receiveraccountno,bal);
        System.out.println("Money Successfully Sent From "+senderUPIid+"to"+receiverUPIid);
    }
    
    public void setReceiverUPIid(String receiverUPIid){
        this.receiverUPIid=receiverUPIid;
    }
    
    public void setSenderUPIid(String senderUPIid){
        this.senderUPIid=senderUPIid;
    }
    
    public void setAmount(double amount){
        this.amount = amount;
    }
}
