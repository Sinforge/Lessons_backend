package Lesson3;

public class CDeveloper extends Employer<Prom_languages>{
    public CDeveloper(String name, int age) {
        super(name, age, Prom_languages.C);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is writing " + getRole() + " code ");

    }
}
