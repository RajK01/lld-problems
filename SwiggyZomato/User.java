package SwiggyZomato;

public class User {
    private String userId;
    private String name;
    private String email;
    private String address;
    private String phone;

    public User(String userId, String name, String email, String address, String phone) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public void placeOrder(String name, String phone) {
        
    }

    public void cancelOrder(String name, String phone) {
        
    }

    public void makePayment(String name, String phone) {
        
    }
}