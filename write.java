 class Writer implements Runnable   
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
     
   }