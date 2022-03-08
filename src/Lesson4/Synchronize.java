package Lesson4;

public class Synchronize {
    public static int a = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            synchronized (Synchronize.class) {
                System.out.println("thread1");
                for (int i = 0; i <= 10; i++) {
                    a++;

                }
                System.out.println("end thread1");
            }
        });
        Thread thread2 = new Thread(() -> {
            synchronized (Synchronize.class) {
                System.out.println("thread2");
                for (int i = 0; i <= 10; i++) {
                    a--;
                    System.out.println();
                }
                System.out.println("end thread2");
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
