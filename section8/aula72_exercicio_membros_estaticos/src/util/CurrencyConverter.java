package util;

public class CurrencyConverter {
	public static double computeConversion(double dollarPrice, double moneyAmount) {
		return dollarPrice * moneyAmount * (1 + 0.06);
	}
}