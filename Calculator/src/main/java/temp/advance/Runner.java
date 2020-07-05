package temp.advance;

import java.util.Scanner;

 class Runner {
	
	public static void main(String[] args) {

	    System.out.println("Enter Operation, Number 1 and Number 2 in sequence");
	    
	    Scanner scanner = new Scanner(System.in);
	    String operations = scanner.nextLine();
	    int num1 = scanner.nextInt();
	    int num2 = scanner.nextInt();		
		
	    int result = 0;
	
	    AbstractOperations calcOperation=null;
	    
	    if (operations.equalsIgnoreCase("add")) {
	    	calcOperation = new AdditionNotToBeUsed(num1,num2);
	    }else if (operations.equalsIgnoreCase("sub")) {
	    	 calcOperation = new SubstractionNotToBeUsed(num1,num2);
	    }else if (operations.equalsIgnoreCase("multiply")) {
	    	 calcOperation = new MultiplicationNotToBeUsed(num1,num2);
	    }
	    
	    
	    calcOperation.performOperation();
		result = calcOperation.getResult();
	   
		System.out.println("Result of the Operation: " + operations + " is: " + result );
	    
	}

}
