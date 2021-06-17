package ru.netology;
import java.lang.*;
public class MyThread extends Thread implements Runnable{

    public MyThread(String threadname, ThreadGroup tgob) {
        super(tgob, threadname);
    }

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println(getName() + "Всем привет!");
            }
        } catch (InterruptedException err) {

        } finally{
            System.out.printf("%s завершен\n", getName());
        }
    }


}
