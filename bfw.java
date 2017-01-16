import java.io.*;
public class bfw
{
public static void main(String args[])throws IOException { 
    
       FileWriter fw=new FileWriter("C:\\User\\WRfile.txt");
       BufferedWriter bfw=new BufferedWriter(fw);
       for(int i=1;i<=5;i++)
       {
    	   bfw.write(Double.toString(Math.random()));
    	   bfw.newLine();
       }
       bfw.flush();
       fw.close();
}
}