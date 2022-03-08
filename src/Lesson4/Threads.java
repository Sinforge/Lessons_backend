package Lesson4;

public class Threads extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread thread1 = new Thread (new Runnable() {
            public void run() {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        });
        Thread thread2 = new Thread (new Runnable() {
            public void run() {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        });

        System.out.println(Thread.currentThread().getName());

        Thread.sleep(5000);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}
