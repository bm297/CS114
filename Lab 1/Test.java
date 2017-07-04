
   public class Test {
   public void main(String args[]){
   String[] words = {"Harry Potter", "Hermione Granger", "Ronald Weasley","Voldemort"};
   
   //creating objects
   ReadingMaterial obj1 = new ReadingMaterial("harryPotter", "JK Rowling", 303);
   Novel obj2 = new Novel(words,"harryPotter", "JK Rowling", 303);
   Article obj3 = new Article("harryPotter", "JK Rowling", 303,"GraphicNovel");
   GraphicNovel obj4 = new GraphicNovel("Jack Kirby", "harryPotter", "JK Rowling", 303);
     
   //printing summary
   System.out.println(obj1.summary());
   System.out.println(obj2.summary());
   System.out.println(obj3.summary());
   System.out.println(obj4.summary());
   }
   }
   
