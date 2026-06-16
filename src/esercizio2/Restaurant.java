package esercizio2;

public class Restaurant {
    private String name;
    private Dish[] dishes;
    private Drink[] drinks;

    public Restaurant(String name, Dish[] dishes, Drink[] drinks) {
        this.name = name;
        this.dishes = dishes;
        this.drinks = drinks;
    }

    public void stampaMenu(){
        System.out.println("Il menu del ristorante " + name);

        System.out.println("I piatti sono:\n");
        for(Dish dish : dishes){
             dish.infoDish();    
        }

        System.out.println("I drinks sono:\n");
        for(Drink drink : drinks){
                drink.infoDrink();    
        }

    }

    public String getName() {
        return name;
    }

    public Dish[] getDishes() {
        return dishes;
    }

    public Drink[] getDrinks() {
        return drinks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDishes(Dish[] dishes) {
        this.dishes = dishes;
    }

    public void setDrinks(Drink[] drinks) {
        this.drinks = drinks;
    }

}
