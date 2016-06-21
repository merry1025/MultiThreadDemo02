package multithreaddemo02;

/**
 * This is the 2nd demo for threading in Java.
 * 
 * It explains how to get and set the name of the threads
 * 
 * To get default name of a thread object:
 * Use:     public final String getName()
 * 
 * To get name of an object that is not a subclass of Threads class:
 * Use:     public static Thread currentThread();
 * 
 */

public class MultiThreadDemo02 {

    public static void main(String[] args) {
//      Get thread name and priority of the main method.
        System.out.println(Thread.currentThread().getName() + ", " + Thread.currentThread().getPriority());
        
//      Create thead objects
        MultiThread02 mt1 = new MultiThread02();
        MultiThread02 mt2 = new MultiThread02();
        
//      Set name method-1, use setName() method
        mt1.setName("1st thread");
        mt2.setName("2nd thread");

//      Set name method-2, set name while creating new object.
//      This method requires a constractor with (String name) parameter for MultiThread02 class 
        MultiThread02 mt3 = new MultiThread02("3rd thread");
        MultiThread02 mt4 = new MultiThread02("4th thread");

//      Start the threads
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();

    }
    
}
