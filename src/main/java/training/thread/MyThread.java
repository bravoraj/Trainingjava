package training.thread;

public class MyThread implements Runnable{

    String str;
    SharedObject obj;
    Thread t;

    public MyThread(SharedObject obj, String str){
        this.obj = obj;
        this.str = str;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        obj.sharedMethod(str);
    }
}