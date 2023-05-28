//Name: Necati
//Surname: Koçak
//Student ID: 150120053
public class Factory {
	private String name;
	private Employee[] employees;
	private Storage storage;
	private Payroll[] payrolls = new Payroll[0];
	private double itemPrice;

	public Factory(String name, int capacity, double itemPrice) {
		this.name = name;
		Storage capacityy = new Storage(capacity);
		this.itemPrice = itemPrice;
		employees = new Employee[0];
	}

	public double getRevenue() {
		double revenue = (storage.getItems().length * itemPrice);
		return revenue;
	}

	public double getPaidSalaries() {
		double sum = 0;
		for (int i = 0; i < payrolls.length; i++) {
			sum += payrolls[i].calculateSalary();
		}
		return sum;
	}

	public void addEmployee(Employee employee) {
		Employee[] tempEm = new Employee[employees.length + 1];
		for (int i = 0; i < employees.length; i++) {
			tempEm[i] = employees[i];
		}
		tempEm[tempEm.length - 1] = employee;
		employees = tempEm;
		employee.startShift();

	}

	public Employee removeEmployee(int id) {
		int b = -1;
		Employee x= null ;
		for (int i = 0; i < employees.length; i++) {
			
				
		}

		if (b == -1) {
			System.out.println("Employee does not exist!");
		} else {
			Employee[] tempEmployees = new Employee[employees.length - 1];
			for (int i = 0; i < b; i++) {
				tempEmployees[i] = employees[i];
			}
			for (int j = b; j < tempEmployees.length - 1; j++) {
				tempEmployees[j] = employees[j + 1];
				 x = employees[b];
			}employees[b].endShift();
			addPayroll(employees[b].getPayroll());
			employees = tempEmployees;
			return x ;

		}
		return null;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	public Payroll[] getPayrolls() {
		return payrolls;
	}

	public void setPayrolls(Payroll[] payrolls) {
		this.payrolls = payrolls;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	private void addPayroll(Payroll payroll) {
		Payroll[] tempPay = new Payroll[payrolls.length+1];
		for (int i = 0; i < payrolls.length; i++) {
			tempPay[i] = payrolls[i];
		}
		tempPay[tempPay.length - 1] = payroll;
		payrolls = tempPay;
	}
}