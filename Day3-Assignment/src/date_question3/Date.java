package date_question3;

public class Date {

	int dd, mm, yy;

	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public void displayDate() {
		if(checkDate()) {
			if(this.dd >= 1 && this.dd < 10)
				System.out.println("0" + this.dd + "-" + this.mm + "-" + this.yy);
			else
				System.out.println(this.dd + "-" + this.mm + "-" + this.yy);
		}
	}
	
	public boolean checkDate() {
		if(this.dd >= 1 && this.dd <= 31)
			if(this.mm >= 1 && this.mm <= 12)
				if(this.yy >= 01 && this.yy <= 99)
					return true;
		return false;
	}
	
	public static void main(String[] args) {
		Date date = new Date(9,12,22);
		date.displayDate();
		boolean ans = date.checkDate();
		if(ans)
			System.out.println("Date entered is correct");
		else
			System.out.println("Invalid Date!!");
	}
}
