package Lesson3;

public class JavaDeveloper extends  Employer<Prom_languages>{
    public JavaDeveloper(String name, int age) {
        super(name, age, Prom_languages.Java);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is writing " + getRole() + " code ");
    }
}
