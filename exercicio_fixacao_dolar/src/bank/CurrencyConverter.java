package bank;

public class CurrencyConverter {
	public double dolar;
	public double quantity;
	
	public double amountToBePaid() {
		double total = (dolar * quantity) + (dolar * quantity) * (6.0/100.0);
		return total;
	}
}
