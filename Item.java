//Name: Necati
//Surname: Koçak
//Student ID: 150120053
public class Item {
private int id;
public static int numberOfItems = 0;
public  Item(int id) {
	this.id = id;
	numberOfItems++;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
}
