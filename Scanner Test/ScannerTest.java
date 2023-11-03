import java.util.*;
import java.lang.*;
import java.io.*;

public class ScannerTest
{
    public static void main(String args[]) throws IOException{
        //Scanner scan = new Scanner(System.in);
        
        //Scanner scan = new Scanner("College Park High School");
        /*
        while(scan.hasNext()){
            System.out.println(scan.next().toUpperCase());
        }
        */
        
       File f = new File("./numbers.txt");
       Scanner scan = new Scanner(f);
       
       System.out.println(f.exists());
       while(scan.hasNext()){
           System.out.println(scan.next());
       }
    }
}
