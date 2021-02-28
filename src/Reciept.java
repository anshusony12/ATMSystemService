
public class Reciept {
	public String location = "New Delhi";
	public String date;
	public String time;
	public int debtAmount;
	public int avalBalance;
	
	
	
	public int getDebtAmount() {
		return debtAmount;
	}
	public void setDebtAmount(int debtAmount) {
		this.debtAmount = debtAmount;
	}
	public int getAvalBalance() {
		return avalBalance;
	}
	public void setAvalBalance(int avalBalance) {
		this.avalBalance = avalBalance;
	}
	public String getLocation() {
		return location;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
