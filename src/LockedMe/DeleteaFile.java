package LockedMe;
//Java program to delete a file 
//Option to delete a user specified file from the application


import java.io.IOException;
import java.nio.file.*;
  
public class DeleteaFile
{
    public static void main(String[] args)
    {
        try
        {
            Files.deleteIfExists(Paths.get("C:\\LockedMe\\Chandra.txt"));
        }
        catch(NoSuchFileException e)
        {
            System.out.println("No such file/directory exists");
        }
        catch(DirectoryNotEmptyException e)
        {
            System.out.println("Directory is not empty.");
        }
        catch(IOException e)
        {
            System.out.println("Invalid permissions.");
        }
          
        System.out.println("Deletion successful.");
    }
}