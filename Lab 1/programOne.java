import java.util.*;

public class programOne{
public static void main(String args[]){
//array declared
int[][] numbers = new int[2][10];

//creating random object
Random rn = new Random();

//filling array
for(int i=0;i<2;i++){
for(int j=0;j<10;j++){
numbers[i][j] = rn.nextInt(100);
}
}

//printng numbers
for(int i=0;i<2;i++){
for(int j=0;j<10;j++){
System.out.println(numbers[i][j]);
}
}
}
}



