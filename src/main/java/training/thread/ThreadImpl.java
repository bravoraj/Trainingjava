package training.thread;

public class ThreadImpl {
    public static void main(String... args) {
        // new ThreadDemo1();
        new Thread("FIRST");
        new Thread("SECOND");

        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("Main thread: " + i);
                Thread.sleep(3000);
            }
        }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("Main Thread exiting....");
        }

    }
