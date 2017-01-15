import java.util.concurrent.TimeUnit;
public class Deamon {
	public static void main(String[] args) { 
        Thread thread = new Thread(new Runnable() {
            public void run() { 
                while(true) { 
                    System.out.print("T"); 
                } 
            }        
        }); 
        thread.setDaemon(true); 
        thread.start(); 
    }
}
