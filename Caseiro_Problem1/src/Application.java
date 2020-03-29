import java.io.IOException;

public class Application {

   public static void main(String[] args) throws IOException {
       
      DuplicateRemover Remover = new DuplicateRemover();
     
      Remover.remove("problem1.txt");
       
      Remover.write("unique_words.txt");
   }
}
