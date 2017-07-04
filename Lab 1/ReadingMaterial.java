public class ReadingMaterial {

   //variables 
   String title;
   String author;
   int numPages;
   
   //constructor
   public ReadingMaterial (String title, String author, int numPages){
   this.title= title;
   this.author= author;
   this.numPages= numPages;
   }
   
   //First function: check if the book has more than 250 pages
   public boolean isLong(){
   return numPages > 250;
   }
   
   //Second function: book information
   public String summary(){
   return "A novel with title "+title+" written by "+author+ " "+numPages+" pages";
   }


}