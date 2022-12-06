package training.thread;

import javafx.scene.control.Tab;

public class Table {
    public static void main(String args[]){
        TableThread T1 = new TableThread("FIRST");
        T1.start();

        TableThread T2 = new TableThread("SECOND");
        T2.start();
    }
}
class TableThread extends Thread{
    private Thread t;
    private String TableThread;
    private int FIRST,SECOND = 0;

    TableThread(String answer){
        TableThread = answer;
    }
    public void start() {
        System.out.println("Table is started");
        if (t == null) {
            t = new Thread(this, TableThread);
            t.start();
        }
    }
    public void run() {
        try {
            if (t.getName().equalsIgnoreCase("FIRST")) {
                for (int i = 1; i < 11; i++) {
                    System.out.println(i + "*5=" + (i * 5));
                    Thread.sleep(2000);
                }
                    System.out.println("Table 5 is end "+TableThread);
            }
             else if (t.getName().equalsIgnoreCase("SECOND")) {
                for (int i = 1; i < 11; i++) {
                    System.out.println(i + "*8=" + (i * 8));
                    Thread.sleep(2000);
                }
                    System.out.println("Table 8 is end "+TableThread);

            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    }

