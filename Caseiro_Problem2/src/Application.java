public class Application{
   
public static void main(String[] args){
     
       DuplicateCounter Counter = new DuplicateCounter();
       
       Counter.count("problem2.txt");
       
       Counter.write("unique_word_counts.txt");
      
   }
}
