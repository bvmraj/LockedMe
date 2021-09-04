// Java program to demonstrate the
// use of listFiles() function
//Retrieving the file names in an ascending order
package LockedMe;
import java.io.File;
public class ListFiles {
    public static void main(String args[])
    {
  
        // try-catch block to handle exceptions
        try {
  
            // Create a file object
            File f = new File("C:\\LockedMe");
  
            // Get all the names of the files present
            // in the given directory
            File[] files = f.listFiles();
  
            System.out.println("Files are listed below:");
  
            // Display the names of the files
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i].getName());
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
