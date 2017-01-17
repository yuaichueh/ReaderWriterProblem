import java.util.concurrent.Semaphore;

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
 