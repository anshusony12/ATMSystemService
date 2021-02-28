
public class Authentication {
	
	
	public static boolean validatePin(Employee e, int pin) {
		if(e.getPin() == pin) {
			return true;
		}
		return false;
	}
	
	public static boolean validatePinInvalidCount(Employee e) {
		int pinValidationCount = e.getPinValidationCount();
		if(pinValidationCount < 3) {
			return true;
		}
		return false;
	}
	
	public static boolean validateTransactionCount(Employee e) {
		int transactionCount = e.getTransactionCount();
		if(transactionCount < 5) {
			return true;
		}
		return false;
	}
	
	public static boolean validateAmount(int amount) {
		if(amount % 100 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean validateAmountQuantity(int amount) {
		if(amount <= 2000) {
			return true;
		}
		return false;
	}
}
