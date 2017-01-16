import java.io.BufferedWriter;
import java.io.FileWriter;

class Writer implements Runnable   
   {
     
       public Writer(String w) {
 
      }
   
       public void run() {
         while (true){
        	 
           for (int i=0;i<4;i++)
            {
            	for(int j=0;j<1000000;j++);
            	  System.out.println(Math.random()+ " is written into the file.");
            	 
            }
          
            SleepUtilities.nap();
         
            
         }
      }
     
   }
    
/*    class Writer implements Runnable   
   {
     
      private int writerNum;
   
       public Writer(int w) {
         writerNum = w;
        
      }
   
       public void run() {
         while (true){
            SleepUtilities.nap();
         
            System.out.println("writer " + writerNum + " is writing.");
           
            SleepUtilities.nap();
         
            
         }
      }
     
   }*/