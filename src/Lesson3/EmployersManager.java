package Lesson3;

import java.lang.reflect.Array;

public class EmployersManager<T> {
    private T[] employers;
    int size = 0;

    @SuppressWarnings("unchecked")
    public EmployersManager(int maxSize, Class<T> clazz) {
        this.employers = (T[]) Array.newInstance(clazz, maxSize);

    }

    public void add(T employer) {
        this.employers[size] = employer;
        size++;
    }

    public T[] getEmployers() {
        return employers;
    }

    public int getSize() {
        return size;
    }



}
