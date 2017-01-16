import java.util.concurrent.Semaphore;
import java.io.*;

public class ReaderWriterProblem {
	  public static final int numofreader = 3;
     
 
     public synchronized static void main(String args[])throws IOException { 
    
       Thread[] readerArray = new Thread[numofreader];
       Writer writer=new Writer("Writer");
       Thread w1=new Thread(writer);
       w1.start();
       
       for (int i = 0;i < numofreader; i++) {
        readerArray[i] = new Thread(new Reader(i));
        readerArray[i].start();
       }
    
      
        
       }
    }


/*import java.util.concurrent.Semaphore;

public class ReaderWriterProblem {
	  public static final int numofreader = 3;
      public static final int numofwriter = 2;
 
     public static void main(String args[]){
    
       Thread[] readerArray = new Thread[numofreader];
       Thread[] writerArray = new Thread[numofwriter];
    
       for (int i = 0;i < numofreader; i++) {
        readerArray[i] = new Thread(new Reader(i));
        readerArray[i].start();
       }
    
       for (int i = 0; i < numofwriter; i++) {
        writerArray[i] = new Thread(new Writer(i));
        writerArray[i].start();
       }
    }
}
 */