import java.io.*; 
import java.util.*; 

public class MultithreadingOperation {
	
	public void sender(String msg) 
    { 
        System.out.println("Sending\t"  + msg ); 
        try
        { 
            Thread.sleep(1000); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println("\n" + msg + "Sent"); 
    } 
} 
class ThreadedSender extends Thread 
{ 
    private String msg; 
    private Thread t; 
    MultithreadingOperation  sender; 
    ThreadedSender(String m,  MultithreadingOperation obj) 
    { 
        msg = m; 
        sender = obj; 
    } 
  
    public void run() 
    {  
        synchronized(sender) 
        { 
            sender.sender(msg); 
        } 
    } 
} 
class SyncDemo 
{ 
    public static void main(String args[]) 
    { 
    	MultithreadingOperation snd = new MultithreadingOperation(); 
        ThreadedSender S1 = 
            new ThreadedSender( " Hi " , snd ); 
        ThreadedSender S2 = 
            new ThreadedSender( " Bye " , snd ); 
        S1.start(); 
        S2.start(); 
        try
        { 
            S1.join(); 
            S2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 
    } 
}