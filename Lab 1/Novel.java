//Novel class   
   public class Novel extends ReadingMaterial {
   String[] characters;
   
   //Constructor
   public Novel(String[] characters, String title, String author, int numPages){
   super(title, author, numPages);
   this.characters= characters;
   }
   
   //Function: listCharacters
   public void listCharacters(){
   for(int i=0;i<characters.length;i++){
   System.out.println(characters[i]);
   }
   }
   
   //summary method
   public String summary(){
   return "Title: "+title+" Written by : "+author+" Novel name : "+characters;
   }
   }
