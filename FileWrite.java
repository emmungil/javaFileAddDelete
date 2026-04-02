import java.util.Scanner; 

import java.io.*; 

  

public class FileWrite 

{ 

   public static void main(String[] args) 

   { 

      try 

      { 

         FileWriter fw = new FileWriter("results.txt"); 

         fw.write("hellos"); 

         fw.close(); 

         System.out.println("\nContent written to the file successfully."); 

      } 

      catch(IOException ioe) 

      { 

         System.out.println("\nException: " +ioe); 

      } 

   } 

}
