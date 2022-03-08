package Lesson3;

public abstract class Employer<T> implements Worker{
    private String name;
    private int age;


    private T role;

    public Employer(String name, int age, T role) {
        this.name = name;
        this.age = age;
        this.role = role;

    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public T getRole() {
        return role;
    }

    public void setRole(T role) {
        this.role = role;
    }

}
