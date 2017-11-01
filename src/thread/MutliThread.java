package thread;

import java.util.concurrent.Callable;

class ExtThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++)
            System.out.println(this.getClass().getName() + ": " + i);
    }
}

class ImpRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++)
            System.out.println(this.getClass().getName() + ": " + i);
    }
}

class ImpCallable implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        return null;
    }
}

public class MutliThread {
    public static void main(String[] args) {
        ExtThread thread1 = new ExtThread();
        ImpRunnable impRunnable = new ImpRunnable();
        Thread thread2 = new Thread(impRunnable);
        thread1.start();
        thread2.start();
    }
}
