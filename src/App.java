public class App {
    public static void main(String[] args) throws Exception {
        // Employee antonio = new Employee("Antonio", "Rossi", 28, 1400);
        // Student luca = new Student("Luca", "Viola", 16, 7);

        // antonio.InfoPerson();
        // luca.InfoPerson();

        // Teacher giuseppe = new Teacher("Giuseppe", "Verdi", 40, 1600, "matematica");
        // giuseppe.infoTeacher();
        // giuseppe.getSalary();

        // Freelancer michele = new Freelancer("Michele", "Bianchi", 37, 1300, "Java");
        // michele.infoFreelancer();
        // michele.salaryFreelancer();

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
