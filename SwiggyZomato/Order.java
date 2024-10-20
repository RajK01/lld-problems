package SwiggyZomato;

public class Order {
    private String orderId;
    private User user;
    private List<Dish> dishes;
    private String status;

    public Order(String orderId, User user, String status) {
        this.orderId = orderId;
        this.user = user;
        this.dishes = new ArrayList<>();
        this.status = status;
    }

    public void updateStatus(double amnt) {
        
    }
}