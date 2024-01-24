package org.example.thread;

import java.util.concurrent.*;

public class MyThread {
    // runnable
    public static void main(String args[]) {
        Thread thread = new Thread(new MyThread().new runnable());
        SubThread subThread = new MyThread().new SubThread();
        CallMethod callable = new MyThread().new CallMethod();
        FutureTask futureTask = new FutureTask(callable);
        /*new Thread(futureTask).start();
        try {
            System.out.println(futureTask.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        thread.start();
        subThread.start();*/

        //Thread pool fixedThreadPool, cachedThreadPool, ScheduledThreadPool
        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 5; i++){
            es.submit(new Thread(new MyThread().new runnable()));
        }
        es.shutdown();
        //ScheduledExecutorService ses = Executors.newScheduledThreadPool(5);
        //ses.scheduleAtFixedRate(thread,0, 2,TimeUnit.SECONDS);
    }

    private class runnable implements Runnable {
        public void run() {

            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
            System.out.println("the thread is running");
        }
    }

    //Thread
    //the difference between method call thread.start() and thread.run
    // run will not create a new thread while start will
    private class SubThread extends Thread {
        public void run() {
            System.out.println("subclass is running");
        }
    }

    // callable to get the result
    private class CallMethod implements Callable {
        public Object call() throws Exception {
            return 10;
        }
    }

}