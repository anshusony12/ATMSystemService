public class Employee {
	private int id;
	private int pin;
	private int avialableBalance;
	private int pinValidationCount;
	private int transactionCount;
	private boolean status = true;
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getAvialableBalance() {
		return avialableBalance;
	}
	public void setAvialableBalance(int avialableBalance) {
		this.avialableBalance = avialableBalance;
	}
	public int getPinValidationCount() {
		return pinValidationCount;
	}
	public void setPinValidationCount(int pinValidationCount) {
		this.pinValidationCount = pinValidationCount;
	}
	public int getTransactionCount() {
		return transactionCount;
	}
	public void setTransactionCount(int transactionCount) {
		this.transactionCount = transactionCount;
	}
	
	public Employee(int id, int pin, int avialableBalance, int pinValidationCount, int transactionCount) {
		super();
		this.id = id;
		this.pin = pin;
		this.avialableBalance = avialableBalance;
		this.pinValidationCount = pinValidationCount;
		this.transactionCount = transactionCount;
	}
}
