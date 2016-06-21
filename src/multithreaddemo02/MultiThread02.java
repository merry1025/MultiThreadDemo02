package multithreaddemo02;

public class MultiThread02 extends Thread {
    
    /*
    * Constructors
    */
    public MultiThread02() {
    }

    public MultiThread02(String name){
            super(name);
    } 

    @Override
    public void run() {
        for (int x = 0; x < 100; x++) {
            System.out.println(getName() + ":" + x); // User getName() to return the name of each thread.
        }
    }
}
