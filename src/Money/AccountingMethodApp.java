package Money;

public class AccountingMethodApp {
	public static double ValueofSupply;
	public static double vatRate;
	public static void main(String[] args) {
		
		ValueofSupply = 10000.0;
		vatRate = 0.1;

		double ValueofSupply = 10000.0;
		double expenseRate = 0.3;
		double vat = getVAT();
		double total = getTotal();
		double expense = getExpense(ValueofSupply, expenseRate);
		double income = ValueofSupply - expense;
		
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;

		System.out.println("Value of supply : " + ValueofSupply);
		System.out.println("Vat : " + vat);
		System.out.println("Total  : " + total);
		System.out.println("Expense  : " + expense);
		System.out.println("Income  : " + income);
		
		System.out.println("Dividend1  : " + dividend1);
		System.out.println("Dividend2  : " + dividend2);
		System.out.println("Dividend3  : " + dividend3);

	}

	public static double getExpense(double ValueofSupply, double expenseRate) {
		return ValueofSupply*expenseRate;
	}

	public static double getTotal() {
		return ValueofSupply + getVAT();
	}

	public static double getVAT() {
		return ValueofSupply *vatRate;
	}
}
