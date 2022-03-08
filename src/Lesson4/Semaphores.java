package Lesson4;

import java.util.concurrent.Semaphore;

public class Semaphores {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(0);
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("HEllo world");
    }

}
