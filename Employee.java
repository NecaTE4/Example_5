//Name: Necati
//Surname: Koçak
//Student ID: 150120053

public class Employee {

		private int id;
		private String name;
		private String surname;
		private int workHour;
		private int speed;
		private Item[] items = new Item[workHour*speed];
		private Payroll payroll;
		public Employee (int id, String name, String surname, int workHour, int speed) {
			this.id = id;
			this.name = name;
			this.surname = surname;
			this.workHour = workHour;
			this.speed = speed;
		}
		public Item[] startShift() {
			for (int i = 0; i < items.length; i++) {
			id = (int)(Math.random()*100+1);
				items[i] = new Item(id);
			}
			
			return items;
		};
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public int getWorkHour() {
			return workHour;
		}
		public void setWorkHour(int workHour) {
			this.workHour = workHour;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public Item[] getItems() {
			return items;
		}
		public void setItems(Item[] items) {
			this.items = items;
		}
		public Payroll getPayroll() {
			return payroll;
		}
		public void setPayroll(Payroll payroll) {
			this.payroll = payroll;
		}
		public Payroll endShift() {
			
			this.payroll = new Payroll(workHour, workHour* speed);
			
			return payroll;
		}
		public String toString() {
			String adas = "This is the employee with id "+ id +" speed " + speed + " . The work hour is "+
		workHour + " and the produced item count is "+ workHour*speed+".";
			return adas;	
		}
		

}
