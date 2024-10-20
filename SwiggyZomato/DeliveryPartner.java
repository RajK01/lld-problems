package SwiggyZomato;

public class DeliveryPartner {
    private String partnerId;
    private String name;
    private String curLocation;

    public Payment(String partnerId, String name, String curLocation) {
        this.partnerId = partnerId;
        this.name = name;
        this.curLocation = curLocation;
    }

    public void updateOrderStatus(String curLocation) {
        
    }
}