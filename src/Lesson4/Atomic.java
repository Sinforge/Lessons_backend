package Lesson4;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {
    public static AtomicInteger a = new AtomicInteger(0);
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i =0 ;i <= 10; i++) {
                a.incrementAndGet();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                a.decrementAndGet();

            }
        });
        System.out.println(a);

    }
}
