import java.io.*;

public class main extends AList{

 public static void main(String arg[]) throws IOException{
 
   AList<Integer> myList = new AList<Integer>(); //Create arrayList
   
   
   //Part A
   int[] a = {11,4,15,20}; //Create Array
   for (int i = 0; i < a.length; i++){
      myList.append(a[i]);
   }
   
   
   //Part B
   int[] b = {9,3,7,22,13};
   int position = 2; //Third element of list
   for (int i=0; i<b.length; i++){
      myList.moveToPos(position);   //Move the curr element to 3rd position of list
      myList.insert(b[i]); //Insert the elements in the current location
      position ++; //Move the curr position after the insertion
      myList.moveToEnd(); //Move curr position to the end
   }
   
    
   //Part C
   System.out.println(myList.length());
   System.out.println(myList.toString());
   
   
   //Part D
   InputStreamReader input =new InputStreamReader(System.in);
   BufferedReader num=new BufferedReader(input);
   
   while (true){
      System.out.println("Enter the number you want to be removed from the list." +
            " Enter 0 when done.");
      int n =Integer.parseInt(num.readLine());
      int listSize = myList.length();
      if (n == 0 || listSize == 0){   //If user terminate or list become empty
         break;      
      }
      boolean found = false;
      for(int i=0; i<listSize; i++){
         myList.moveToPos(i); //Iterate the curr position from 0 to end
         if(n == myList.getValue()){
            found = true;
            myList.remove(); //Remove element from list
            break;
         }
      }
      
      if(found==false){
         System.out.println("not find");
      }
   }
   
   myList.moveToEnd();
   System.out.println(myList.length());   //Print the length of AList
   System.out.println(myList.toString()); //Print AList itself
   
   //Part D
       while(true)
       {
           System.out.println("Enter the number you want to insert at the beginning of list or enter 0 to terminate");
           int n=Integer.parseInt(num.readLine());
           int listSize=myList.length();
           if(n==0 || listSize==myList.getMaxsize()) //If user terminates or list reaches max size
           {
               break;
           }
          
           myList.moveToStart();
           myList.insert(n);
       }
      
       myList.moveToEnd();
       System.out.println(myList.length());
       System.out.println(myList.toString());

   
 


   
   
}
}