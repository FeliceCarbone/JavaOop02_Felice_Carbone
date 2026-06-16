package esercizio1;

public class Student extends Person {
    public int average;
    public Student(String name, String surname, int age, int average) {
        super(name, surname, age);
        this.average=average;
    }

    @Override
    public void InfoPerson() {
        System.out.println("Ciao, sono " + name + " " + surname + " ho " + age + " anni e la mia media è di  " + average);
    }

}
