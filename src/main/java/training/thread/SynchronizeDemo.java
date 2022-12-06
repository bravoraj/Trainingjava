package training.thread;

public class SynchronizeDemo {
    public static void main(String... args){
        SharedObject obj= new SharedObject();
        MyThread t1= new MyThread(obj,"Spirit");
        MyThread t2= new MyThread(obj,"Of");
        MyThread t3= new MyThread(obj,"ABC");
        try
        {
            t1.t.join();
            t2.t.join();
            t3.t.join();

        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
