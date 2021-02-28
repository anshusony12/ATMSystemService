import java.util.Scanner;

public class ATM {
	
	public static void getScreen(int totalCash) {
		Scanner sc = new Scanner(System.in);
		while(totalCash > 0) {
			System.out.println("Welcome To ATM Service");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Balance Enquiry");
            System.out.println("Choose 3 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = sc.nextInt();
            
            if(n==1) {
//            	withdraw amount 
            	System.out.println("Enter your account id");
            	int id = sc.nextInt();
            	BankDataBase b = new BankDataBase();
            	Employee employee = b.getEmployeeById(id);
            	if(employee!=null) {
            		boolean status = employee.isStatus();
            		if(status) {
            			System.out.println("Enter your PIN Code");
            			int pin = sc.nextInt();
            			boolean validatePin = Authentication.validatePin(employee, pin);
            			if(validatePin) {
            				System.out.println("Enter amount in multiple of Rs 100");
            				int amount = sc.nextInt();
            				if(amount <= totalCash) {
//            					now validation of amount
            					boolean validateAmount = Authentication.validateAmount(amount);
            					if(validateAmount) {
            						boolean validateAmountQuantity = Authentication.validateAmountQuantity(amount);
            						if(validateAmountQuantity) {
            							int transactionCount = employee.getTransactionCount();
                						employee.setTransactionCount(transactionCount + 1);
                						if(Authentication.validateTransactionCount(employee)) {
                							if(amount > totalCash) {
                								System.out.println("Insufficient Balance....");
                							}
                							else {
                								Dao.withdrawBalance(employee, amount);
                    							totalCash = totalCash - amount;
                							}
                						}
                						else
                							System.out.println("you have exceed the transaction limit of a day");
            						}
            						else
            							System.out.println("Maximum amount per transaction must not exceet limit of Rs 2000");
            					}
            					else
            						System.out.println("Please enter amount in multiple of Rs 100");
            				}
            				else
            					System.out.println("insufficient balance in ATM....");
            			}
            			else {
            				int pinValidationCount = employee.getPinValidationCount();
            				employee.setPinValidationCount(pinValidationCount + 1);          			
//            				now checking for status update of account
            				if(!(Authentication.validatePinInvalidCount(employee))) {
            					employee.setStatus(false);
            					System.out.println("Account has been blocked permanently...Due to three invalid attempts");
            					System.out.println();
            				}
            				else
            					System.out.println("invalid pin...try again !!");
            			}
            		}
            		else	
            			System.out.println("Account has been blocked permanently");
            	}
            	else {
            		System.out.println("Invalid Account Id, Employee does not exist");
            	}
            }
            else if(n==2) {
//            	check balanceSystem.out.println("Enter your account id");
            	System.out.println("Enter your account id");
            	int id = sc.nextInt();
            	BankDataBase b = new BankDataBase();
            	Employee employee = b.getEmployeeById(id);
            	if(employee!=null) {
            		boolean status = employee.isStatus();
            		if(status) {
            			System.out.println("Enter your PIN Code");
            			int pin = sc.nextInt();
            			boolean validatePin = Authentication.validatePin(employee, pin);
            			if(validatePin) {
            				Dao.balanceEnquiry(employee);
            			}
            			else {
            				int pinValidationCount = employee.getPinValidationCount();
            				employee.setPinValidationCount(pinValidationCount + 1);          			
//            				now checking for status update of account
            				if(!(Authentication.validatePinInvalidCount(employee))) {
            					employee.setStatus(false);
            					System.out.println("Account has been blocked permanently...Due to three invalid attempts");
            					System.out.println();
            				}
            				else
            					System.out.println("invalid pin...try again !!");
            			}
            		}
            		else	
            			System.out.println("Account has been blocked permanently");
            	}
            	else {
            		System.out.println("Invalid Account Id, Employee does not exist");
            	}
            	
            }
            else if(n==3) {
            	break;
            }
            else
            	System.out.println("invalid input pressed...");
            	System.out.println();
		}
		if(totalCash == 0) {
			System.out.println("ATM can not dispense cash right now....");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalCash = 10000;
		ATM.getScreen(totalCash);
		
	}

}
