package training.thread;

public class Math {

    public static void main(String args[]){

        CalculationThread T1 = new CalculationThread("Add");
        T1.start();

        CalculationThread T2 = new CalculationThread("Sub");
        T2.start();

    }
}

class CalculationThread extends Thread{
    private Thread t;
    private String Math;
    private int count = 0;
    private int add,sub = 0;

    CalculationThread(String answer){
        Math = answer;
    }

    public void start() {
        System.out.println("Start cal of " + Math + "\n");
        if (t == null) {
            t = new Thread(this, Math);
            t.start();
        }
    }
    public void run(){
        try {
            for (int x = 0; x < 3; x++) {

                if (Math == "Add") {
                    System.out.println("Cal: " + Math + " of " + count +
                            " + " + count + " = " + add + "\n");
                    Thread.sleep(2000);
                    count++;
                    add = count + count;
                } else if (Math == "Sub") {
                    System.out.println("Cal: " + Math + " of " + count +
                            " - " + count + " = " + sub + "\n");
                    Thread.sleep(2000);
                    count++;
                    sub = count - count;
                }
            }
        }
        catch (InterruptedException e){
                    System.out.println("Math error");
                }
                if(Math == "Add"){
                    System.out.println("Add completed.....");
                }
                else if(Math == "Sub"){
                    System.out.println("Sub completed.....");
                }
            }
}