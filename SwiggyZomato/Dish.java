package SwiggyZomato;

public class Dish {
    private String dishId;
    private String name;
    private double price;
    private String category;
    private Boolean isAvailable;
    private double rating;

    public Payment(String dishId, String name, double price, String category, double rating, Boolean isAvailable) {
        this.dishId = dishId;
        this.name = name;
        this.price = price;
        this.category = category;
        this.rating = rating;
        this.isAvailable = isAvailable;
    }

    public void updateAvailability(Boolean isAvailable) {
        
    }
}