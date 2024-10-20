package SwiggyZomato;

import java.util.ArrayList;

public class Menu {
    private List<Dish> dishes;
    private Dish dish;

    public Manu(Dish dish) {
        this.dish = dish;
        this.dishes = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void removeDish(Dish dish) {
        dishes.remove(dish);
    }
}