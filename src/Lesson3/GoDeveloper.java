package Lesson3;

public class GoDeveloper extends Employer<Prom_languages>{

    public GoDeveloper(String name, int age) {
        super(name, age, Prom_languages.Go);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is writing " + getRole() + " code ");

    }
}
