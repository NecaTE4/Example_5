//Name: Necati
//Surname: Koçak
//Student ID: 150120053
public class Storage {
	private int capacity;
	private Item[] Items;
	public Storage(int capacity) {
		this.capacity = capacity;
		Items = new Item[0];
	}
	public void addItem(Item item) {
		Item[] temp = new Item[Items.length+1];
		for (int i = 0; i < Items.length; i++) {
			temp[i] = Items[i];
		}
		temp[Items.length] = item;
		Items = temp;
		
	}
	public Item[] getItems() {
		return Items;
	}
	public void setItems(Item[] items) {
		Items = items;
	}
	
	
}
