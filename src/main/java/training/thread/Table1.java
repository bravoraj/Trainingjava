package training.thread;

public class Table1 implements Runnable{

    String threadName;
    TableObject obj;
    Thread t;
    public Table1(TableObject obj , String threadName) {
        this.obj = obj;
        this.threadName = threadName;
        t=new Thread(this,this.threadName);
        t.start();
    }

    @Override
    public void run() {
        obj.tableMethod(threadName);
    }
}
