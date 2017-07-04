   public class GraphicNovel extends ReadingMaterial{
   String illustrator;
     
   //constructor
   public GraphicNovel(String illustrator, String title, String author, int numPages) {
   super(title, author, numPages);
   this.illustrator = illustrator;
   }
   //summary method
   public String summary(){
   return "Title: "+title+" Written by : "+author+" illustrated by : "+illustrator;
   }     
   }

