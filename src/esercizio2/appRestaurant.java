package esercizio2;

public class appRestaurant {
    public static void main(String[] args) throws Exception {
        

        Dish[] listaPiatti = new Dish[3];
        listaPiatti[0] = new Dish("Carbonara", 13.50);
        listaPiatti[1] = new Dish("Cacio e Pepe", 10);
        listaPiatti[2] = new Dish("Amatriciana ", 12.50);

        Drink[] listaDrink = new Drink[3];
        listaDrink[0] = new Drink("Pungirosa", 25);
        listaDrink[1] = new Drink("Peroni", 3.50);
        listaDrink[2] = new Drink("CocaCola", 2);

        Restaurant anticoRistorante = new Restaurant("Antico Ristorante", listaPiatti, listaDrink);
        anticoRistorante.stampaMenu();
        
    }
}
