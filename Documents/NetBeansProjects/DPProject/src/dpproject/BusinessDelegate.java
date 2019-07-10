package dpproject;
public class BusinessDelegate {
    
    private BusinessLookUp lookupService;
    private BusinessService businessService;
    private String serviceType;
    
    public void setServiceType(String serviceType)
    {
        this.serviceType=serviceType;
    }
    
    public void doTask(){
        businessService=lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}


