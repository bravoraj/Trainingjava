package training.thread;

public class TableObject{
    synchronized void tableMethod(String threadName) {

        try{
            if(threadName.equalsIgnoreCase("FIRST")){
                System.out.println("Table of 5 is :");
                for (int i = 1; i < 11; i++) {
                    Thread.sleep(2000);
                    System.out.println(i+"*5="+(i * 5));
                }

                System.out.println("Table of 5 Exiting...");
                Thread.sleep(3000);
            }
            if(threadName.equalsIgnoreCase("SECOND")){
                System.out.println("Table of 8 is :");
                for (int i = 1; i < 11; i++) {
                    Thread.sleep(2000);
                    System.out.println(i+"*8="+(i * 8));
                }
                System.out.println("Table of 8 Exiting...");
                Thread.sleep(3000);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
