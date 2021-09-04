package LockedMe;

//Java Program to create new file using File class
//Option to add a user specified file to the application

//Importing new files
import java.io.File;  
import java.io.IOException;  
public class CreateFile  
{  
public static void main(String[] args)   
{     
File file = new File("C:\\LockedMe\\music.txt"); //initialize File object and passing path as argument  
boolean result;  
try   
{  
result = file.createNewFile();  //creates a new file  
if(result)      // test if successfully created a new file  
{  
System.out.println("file created "+file.getCanonicalPath()); //returns the path string  
}  
else  
{  
System.out.println("File already exist at location: "+file.getCanonicalPath());  
}  
}   
catch (IOException e)   
{  
e.printStackTrace();    //prints exception if any  
}         
}  
}  