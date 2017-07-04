import java.util.Random;

public class BankSimulation {
	public static void main(String[] args){

		int customerNum = 0;
		int customerServed = 0;
		final int MAX_NUMBER_CUSTOMER = 5;
		final int MAX_NUMBER_TELLER = 4;

		Random generator = new Random();

		Line line = new Line();

		//Customer loop
		int process = 0;
		while(process < 10){
			int num = generator.nextInt(MAX_NUMBER_CUSTOMER);
			for (int i=0; i<= num; i++){
				customerNum++;
				Customer person = new Customer(customerNum);
				line.addCustomer(person);
				System.out.println("Customer " + customerNum + " joined the line");
			}//end of customer loop

			//Teller loop
			num = generator.nextInt(MAX_NUMBER_TELLER);
			for (int j=0; j<= num; j++){
				if(line.isEmpty()){
					System.out.println("Teller are waiting...");
				}
				else{
					line.nextCustomer();
					customerServed++;
					System.out.println("Customer " + customerServed + " is being served");
				}
			}//end of teller loop
			process++;
			if(!line.isEmpty()){
				System.out.println(line.queue);
			}
		}//end of while loop
		
		//Bank is closed and serving the last customers on the line
		while(!line.isEmpty()){
			line.nextCustomer();
			customerServed++;
			System.out.println("Customer " + customerServed + " is being served");
		}//end while loop
		System.out.println("The bank is closed and the line is cleared");
	}
}
