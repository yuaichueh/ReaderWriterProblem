
    class Reader implements Runnable
   {
   
     
      private int readerNum;
   
       public Reader(int readerNum) {
         this.readerNum = readerNum;
      
      }
   
       public void run() {
         while (true) {
            SleepUtilities.nap();
         
            System.out.println("reader " + readerNum + " wants to read.");
            
         
         // you have access to read from the database
         // let's read for awhile .....
            SleepUtilities.nap();
         
         
         }
      }
   ;
   }
