
    class Writer implements Runnable
   {
     
      private int writerNum;
   
       public Writer(int w) {
         writerNum = w;
        
      }
   
       public void run() {
         while (true){
            SleepUtilities.nap();
         
            System.out.println("writer " + writerNum + " wants to write.");
           
         
         // you have access to write to the database
         // write for awhile ...
            SleepUtilities.nap();
         
            
         }
      }
   
   
   }