import java.util.Scanner;

public class FactorialNumber {

   int factorialNumber;

   public FactorialNumber() {
       // TODO Auto-generated constructor stub
   }

   /**
   * @param factorialNumber
   */
   public FactorialNumber(int factorialNumber) {

       this.factorialNumber = factorialNumber;
   }

   /**
   * @return the factorialNumber
   */
   public int getFactorialNumber() {
       return factorialNumber;
   }

   /**
   * method to factorialNumber to set if factorialNumber is int then return
   * true otherwise false
   *
   * @param factorialNumber
   *
   */
   public boolean setFactorialNumber(String factorialNumber) {
       // this.factorialNumber = factorialNumber;

       try {
           this.factorialNumber = Integer.parseInt(factorialNumber);
       } catch (Exception e) {
           // TODO: handle exception
           return false;
       }

       return true;
   }

   /**
   * @return the factorialValue
   */
   public int getFactorialValue(int factorialNumber) {

       int output;
       if (factorialNumber == 1) {
           return 1;
       }
       // Recursion: Function calling itself!!
       output = getFactorialValue(factorialNumber - 1) * factorialNumber;
       return output;

   }

   /**
   * @param args
   */
   public static void main(String[] args) {
       // TODO Auto-generated method stub

       Scanner scanner = new Scanner(System.in);
       FactorialNumber factorialNumber = new FactorialNumber();
       do {
           System.out.print("Enter the Factorial Number:");
           String factorialString = scanner.next();
           if (factorialString.equals("0")) {
               break;
           } else if (factorialNumber.setFactorialNumber(factorialString)) {
               int factorialValue = factorialNumber
                       .getFactorialValue(factorialNumber.getFactorialNumber());
               System.out.println("Factorial Value of "
                       + factorialNumber.getFactorialNumber() + " is "
                       + factorialValue);

           } else {
               System.out.println("Enter Valid Number!");

           }

       } while (true);

   }
}