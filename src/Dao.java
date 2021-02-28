
public class Dao {
	
	public static void withdrawBalance(Employee e, int amount) {
		e.setAvialableBalance(e.getAvialableBalance() - amount);
		Reciept reciept = Printer.getRecieptOfTransaction(e, amount);
		Printer.printTransactionReciept(reciept);
	}
	
	public static void balanceEnquiry(Employee e) {
		int avialableBalance = e.getAvialableBalance();
		Reciept reciept = Printer.getRecieptForBalanceEnquiry(e);
		Printer.printBalanceEnquiryReciept(reciept);
	}
}
