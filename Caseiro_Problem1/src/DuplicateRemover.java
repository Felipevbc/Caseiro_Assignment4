import java.io.File;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {

private Set < String > UWords;

public void Remove(String DataFile) {
	 
	try {
	 
   String Word;
	 
	 UWords = new HashSet < String > ();
	 
   Scanner sc = new Scanner(new File(DataFile));
	 
	 while (sc.hasNext()) {
	 		
	 Word = sc.next();
	 		
   UWords.add(Word);
	 	
   }
	 	
    sc.close();
	 	
} 
  
  catch (Exception Excep) {
         
      System.out.println(Excep.getMessage());
     
  }

}

 
 public void Write(String OutputFile) {
	 
 try {
	
   File NewFile;
	 FileWriter FileWri = null;

	 NewFile = new File(OutputFile);
	 
 if (NewFile.exists()) {
		 
     FileWri = new FileWriter(NewFile, true);
		 
	   Iterator Ite = UWords.iterator();
  
     while (Ite.hasNext()) {
			 
      String Strin = (String) Ite.next();
			 
      FileWri.write(Strin + "\n");
		 
   }
		 
		 FileWri.close();
		 
     System.out.println("The data was uploaded to the Output File!");

	 } 
   
   else {
		 
     NewFile.createNewFile();
		 FileWri = new FileWriter(NewFile);
		 
     Iterator Ite = UWords.iterator();

		 while (Ite.hasNext()) {
			 
     String Strin = (String) Ite.next();
		 FileWri.write(Strin + "\n");
		 
     }
		
		 FileWri.close();
		 System.out.println("The data was uploaded to the Output File!")
	 
   }
	 

	  } 
   
   catch(Exception Excep ) {
		  
   System.out.println(Excep.getMessage());
    
   }
   
 }

}
