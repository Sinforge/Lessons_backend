package Lesson3;

public class PythonDeveloper extends Employer<Prom_languages>{
    public PythonDeveloper(String name, int age) {
        super(name, age, Prom_languages.Python);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is writing " + getRole() + " code ");


    }
}
