//Name: Necati
//Surname: Koçak
//Student ID: 150120053
public class Payroll {
	private int workHour;
	private int itemCount;

	public Payroll(int workHour, int itemCount) {
		this.workHour = workHour;
		this.itemCount = itemCount;
	}

	public int calculateSalary() {
		int totalSalary = (workHour * 3) + 2 * itemCount;
		return totalSalary;
	}

	public String toString() {
		String asd = "The work hour is "+ workHour+ " and the produced item count is " + itemCount +".";
		return asd;
	}
	
}
