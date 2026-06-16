package esercizio1;

public class appPerson {
    public static void main(String[] args) throws Exception {
        Employee antonio = new Employee("Antonio", "Rossi", 28, 1400);
        Student luca = new Student("Luca", "Viola", 16, 7);

        antonio.InfoPerson();
        luca.InfoPerson();

        Teacher giuseppe = new Teacher("Giuseppe", "Verdi", 40, 1600, "matematica");
        giuseppe.infoTeacher();
        giuseppe.getSalary();

        Freelancer michele = new Freelancer("Michele", "Bianchi", 37, 1300, "Java");
        michele.infoFreelancer();
        michele.salaryFreelancer();

        
        
    }
}
