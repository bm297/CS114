

import java.util.Scanner;

/**

*

* @author Beshoy Megalaa

*/

class Main extends FactorialNumber {

    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        // TODO code application logic here
        

        

        System.out.println("----------------------------");

        Scanner s1 = new Scanner(System.in);

       System.out.println("Enter num");

        int factnum = s1.nextInt();

       

        Scanner s2 = new Scanner(System.in);

        System.out.println("Enter number");

        int number = s2.nextInt();

       

        Scanner s3 = new Scanner(System.in);

        System.out.println("Enter power");

        int pownum = s3.nextInt();

       

        System.out.println("Given number is factorial") ;

        int result = factorial(factnum);

        System.out.println("----------------------------");

        System.out.println("----------------------------");

        System.out.println("factorial number"+result);

        System.out.println("----------------------------");

        System.out.println("----------------------------");

   

        System.out.println("Given number is power") ;

        int powresult = findpower(number,pownum);

        System.out.println("----------------------------");

        System.out.println("----------------------------");

        System.out.println("factorial number"+powresult);

        System.out.println("----------------------------");

        System.out.println("----------------------------");

   

    }
    
    void getFactorialValue() {
	}

    // recursive power function of two numberes

        static int findpower(int number,int pownum){

            if(number ==0)

                return 1;

            else if(pownum==1)

                return number;

            else

                return number*findpower(number,pownum-1);

           

        }

        //recursive function of factorial

        static int factorial(int num)

        {

                if(num <= 1)

                        //if the number is 1 then return 1

                        return 1;

                else

                       //else call the same function with the value - 1

                       return num* factorial(num-1);

        }

       

    }