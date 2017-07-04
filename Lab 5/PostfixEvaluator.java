import java.io.*;
import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;

public class PostfixEvaluator {
	public static String insertBlanks(String s) {
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == ')' || 
					s.charAt(i) == '+' || s.charAt(i) == '-' ||
					s.charAt(i) == '*' || s.charAt(i) == '/')
				result += " " + s.charAt(i) + " ";
			else
				result += s.charAt(i);
		}
		return result;
	}
	public static void main(String[] args) {

		System.out.println("Enter postfix expression to evaluate: ");
		Scanner sc = new Scanner(System.in);

		PostfixEvaluator obj = new PostfixEvaluator();
		System.out.println("\nTHE FINAL RESULT  "+ obj.evalPf(sc));
	}

	public double evalPf(Scanner sc){

		// Create operandStack to store operands
		Stack<Double> operandStack = new Stack<Double>();

		String expression="";

		// getting the input in a string

		if (sc.hasNext())
			expression = sc.nextLine();
		//expression = insertBlanks(expression);//method to insert a blank space between the tokens

		// Now I can use the split function to get individual elements in the String array
		String[] tokens = expression.split(" ");

		// Scanning the String array for individual tokens
		for (String token: tokens) {
			String c = token.trim(); System.out.println(c);
			if ((c.length() == 0 )||(c.equals(" "))) // Blank space
				continue; // Back to the while loop to extract the next token
			else 
			{

				if ((c.equals("+") || c.equals("-") ||
						c.equals("%") ||c.equals("*") ||c.equals("/"))){


					double a=0, b=0;
					if (!operandStack.isEmpty()) {

						a =operandStack.pop();
						//System.out.println("POP A" + Arrays.toString(operandStack.toArray()));
						if (!operandStack.isEmpty()){

							b= operandStack.pop();
							//System.out.println("POP B" + Arrays.toString(operandStack.toArray()));
							double r=0;
							switch(c)  
							{  
							case "+":r=b+a;  
							break;  
							case "-":r=b-a;  
							break;  
							case "*":r=a*b;  
							break;  
							case "/":r=b/a;  
							break;  
							case "%" : r=b%a;
							default: r=0;  
							}
							operandStack.push(r);
							//System.out.println("PUSH RESULT" +Arrays.toString(operandStack.toArray()));

						} else {System.out.print("\n Invalid PostFix expression : Terminating ... Try again"); System.exit(0);}
					}
					else{System.out.print("\n Invalid PostFix expression : Terminating ... Try again"); System.exit(0);}
				}
				else if((Integer.parseInt(token)>=0)&&((Integer.parseInt(token)<=100)))
				{  operandStack.push(Double.parseDouble(token));  //System.out.println("PUSH VALUES" +Arrays.toString(operandStack.toArray()));

				}
			}

		}
		//System.out.println(" XXXXXXXXXXXXXXXfinal result" + operandStack.peek());
		return operandStack.pop();
	}

}
/* TEST DATA
Enter postfix expression to evaluate: 
9 3 / 6 / 4 * 10 –
THE FINAL RESULT  -8
Enter postfix expression to evaluate: 
5 2 + 8 5 - *
THE FINAL RESULT  21
Enter postfix expression to evaluate: 
2 4 - 5 2 * +
THE FINAL RESULT  8


 */