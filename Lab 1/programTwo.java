import java.util.*;

import java.util.Scanner;
public class programTwo{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
//reading string from user
System.out.println("Enter name: ");
String name = sc.nextLine();

//printing the name in reverse
for(int m = name.length() - 1; m >= 0; m--){
System.out.print(name.substring(m, m + 1));

}
}
}