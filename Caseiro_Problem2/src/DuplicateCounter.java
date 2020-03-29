import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCounter{
  
   private HashMap<String, Integer> Counter;
   
  
   public DuplicateCounter(){
       
     Counter = new HashMap<String, Integer>();
   }

   
   public void Count(String dataFile){
	 
   Counter.clear();
       
    try{
    	   Scanner in = new Scanner(new File(DataFile));
         String Word;
           
         while(in.hasNext()){
               Word = in.next();
               
               if(!Word.equals("")) {
            	   
                   if(Counter.get(Word) == null)
                       Counter.put(Word, 1);
                   
                    else
                	  Counter.put(Word, Counter.get(Word) + 1);
               }
           }
           
           in.close();
           } 
           
            catch(Exception Excep) {
                  System.out.println(Excep.getMessage());
       }
   }

   
   public void Write(String OutputFile){
	   
	   
       try{
           PrintWriter out = new PrintWriter(new File(OutputFile));
           
           
           for(String Word : Counter.keySet()){
               out.println(Word + " -> " + Counter.get(Word));
           }
          
           out.close();
           
       
       } catch(Exception Excep) {
           System.out.println(Excep.getMessage());
      }
   }
}
