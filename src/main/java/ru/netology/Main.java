package ru.netology;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ThreadGroup mainGroup =new ThreadGroup("main group");

        Thread myThread1 =new MyThread ("Я поток 1.", mainGroup);
        Thread myThread2 =new MyThread("Я поток 2.", mainGroup);
        Thread myThread3 =new MyThread("Я поток 3.", mainGroup);
        Thread myThread4 =new MyThread("Я поток 4.", mainGroup);

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

        try {
            Thread.sleep(15000);
            System.out.println("Closing all threads...");
        } catch (InterruptedException exception ) {
            exception.printStackTrace();
        }

        mainGroup.interrupt();
    }

}
