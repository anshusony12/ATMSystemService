import java.text.DateFormat;
import java.util.Date;

public class Printer {
	
	public static Reciept getRecieptOfTransaction(Employee e, int debt_amout) {
		Date currentDate = new Date();
		String date = DateFormat.getDateInstance().format(currentDate);
		String time = DateFormat.getTimeInstance().format(currentDate);
		Reciept reciept = new Reciept();
		reciept.setDate(date);
		reciept.setTime(time);
		reciept.setDebtAmount(debt_amout);
		reciept.setAvalBalance(e.getAvialableBalance());
		return reciept;
	}
	
	public static Reciept getRecieptForBalanceEnquiry(Employee e) {
		Date currentDate = new Date();
		String date = DateFormat.getDateInstance().format(currentDate);
		String time = DateFormat.getTimeInstance().format(currentDate);
		Reciept reciept = new Reciept();
		reciept.setDate(date);
		reciept.setTime(time);
		reciept.setAvalBalance(e.getAvialableBalance());
		return reciept;
	}
	
	public static void printTransactionReciept(Reciept reciept) {
		System.out.println("ATM Location : "+reciept.getLocation());
		System.out.println("Date : "+ reciept.getDate());
		System.out.println("Time : "+ reciept.getTime());
		System.out.println("Deducted Amount : "+ reciept.getDebtAmount());
		System.out.println("Available Balance : "+reciept.getAvalBalance());
	}
	
	public static void printBalanceEnquiryReciept(Reciept reciept) {
		System.out.println("ATM Location : "+reciept.getLocation());
		System.out.println("Date : "+ reciept.getDate());
		System.out.println("Time : "+ reciept.getTime());
		System.out.println("Available Balance : "+reciept.getAvalBalance());
	}
	
	
}
