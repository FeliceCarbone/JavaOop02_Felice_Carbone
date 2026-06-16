package esercizio1;

public class Teacher extends Employee{
    public String subject;

    public Teacher(String name, String surname, int age, int salary, String subject) {
        super(name, surname, age, salary);
        this.subject = subject;
    }

    public void infoTeacher(){
        System.out.println("Il professore " + name + " " + surname + " insegna " + subject);
    }

    public void getSalary(){
        System.out.println("Lo stipendio del professore" + name + " " + surname + "è di " + salary + " euro al mese");
    }

}
