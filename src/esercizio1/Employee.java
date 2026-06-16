package esercizio1;

public class Employee extends Person {
    public int salary;
    public Employee(String name, String surname, int age, int salary) {
        super(name, surname, age);
        this.salary = salary;
    }

    @Override
    public void InfoPerson() {
       System.out.println("Ciao, sono " + name + " " + surname + " ho " + age + " anni e prendo " + salary + " euro al mese");
    }
    
}
