package Lesson3;

public class Lesson3 {
    public static void main(String[] agrs) {
        Employer javist = new JavaDeveloper("Vlad", 18);
        Employer cist = new CDeveloper("Anton", 20);
        Employer python = new PythonDeveloper("Oleg", 17);
        Employer goist = new GoDeveloper("Alex", 30);

        ITCompany mycompany = new ITCompany(4, "Samsung");
        mycompany.add(javist);
        mycompany.add(cist);
        mycompany.add(python);
        mycompany.add(goist);

        mycompany.startWork();
    }
}
