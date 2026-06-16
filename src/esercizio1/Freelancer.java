package esercizio1;

public class Freelancer extends Employee {
    public String project;

    public Freelancer(String name, String surname, int age, int salary, String project) {
        super(name, surname, age, salary);
        this.project = project;
    }

    public void infoFreelancer(){
        System.out.println("Il freelancer " + name + " " + surname + " lavora al progetto " + project);
    }
    
    public void salaryFreelancer(){
        System.out.println("Lo stipendio del freelancer " + name + " " + surname + " è di " + salary + " euro al mese");
    }

}
