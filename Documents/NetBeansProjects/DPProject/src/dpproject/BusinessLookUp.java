package dpproject;

public class BusinessLookUp {
     
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("UPI")){
            return new UPIService();
        }
        else {
            return null;
        } 
    }
}