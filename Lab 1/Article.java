   public class Article extends ReadingMaterial{
   String publication;
     
   //constructor
   public Article(String title, String author, int numPages,String publication) {
   super(title, author, numPages);
   this.publication = publication;
   }
     
   //summary method
   public String summary(){
   return "Title: "+title+" Written by : "+author+" published in : "+publication;
   }
   }
