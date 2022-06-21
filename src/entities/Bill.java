package entities;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double feeding() {
		return (beer * 5.00) + (barbecue * 7.00) + (softDrink * 3.00);
	}
	
	public double cover() {
		double totalFeed = feeding();
		if (totalFeed > 30.00) {
			return 0;
		}
		else {
			return 4.00;
		}
	}
	
	public double ticket() {
		double ticketValue = 0.0;
		if (gender == 'F' || gender == 'f') {
			ticketValue = 8.00;
		}
		else if (gender == 'M' || gender == 'm') {
			ticketValue = 10.00;
		}
		return ticketValue;
	}
	
	public double total() {
		return feeding() + cover() + ticket();
	}
	
}
