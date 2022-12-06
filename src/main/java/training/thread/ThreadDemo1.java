package training.thread;

public class ThreadDemo1 implements Runnable {
    Thread t;
    ThreadDemo1(){
        t=new Thread(this,"Demo1");
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("child thread: "+t);
        t.start();
    }
    @Override
    public void run() {
        try {
            for (int i = 1; i < 3; i++) {
                System.out.println("child thread: " + i);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("child Thread exiting....");
    }
}
