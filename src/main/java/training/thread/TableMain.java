package training.thread;

public class TableMain {

    public static void main(String[] args) {

        TableObject obj = new TableObject();
        Table1 t1 = new Table1(obj,"FIRST");
        Table1 t2 = new Table1(obj,"SECOND");
    }
}