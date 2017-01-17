 class Reader implements Runnable 
   {
   
     
      private int readerNum;
   
       public Reader(int readerNum) {
         this.readerNum = readerNum;
      
      }
   
       public void run() {
         while (true) {
            SleepUtilities.nap();
         
            System.out.println("reader " + readerNum + " is reading.");
            
            SleepUtilities.nap();
         
         
         }
      }
   ;
   }
