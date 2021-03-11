package demo;

public class ExchangeRateCoverter {

	private double rate;
	
	public ExchangeRateCoverter (double rate) {
		this.rate = rate;
	}
	
	public double covertCurrency(double currencyFrom) {
		return rate * currencyFrom;
	}
}
