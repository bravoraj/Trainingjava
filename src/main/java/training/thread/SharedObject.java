package training.thread;

public class SharedObject {
     synchronized void sharedMethod(String str){
        System.out.print("[");
        System.out.print(str);
        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("]");
    }
}
