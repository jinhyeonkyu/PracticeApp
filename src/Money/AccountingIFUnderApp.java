package Money;

public class AccountingIFUnderApp {

	public static void main(String[] args) {
		
		double ValueofSupply = Double.parseDouble(args[0]);
		double VatRate = 0.1;
		double expenseRate = 0.3;
		double vat = ValueofSupply * VatRate;
		double total = VatRate + vat;
		double expense = ValueofSupply * expenseRate;
		double income = ValueofSupply - expense;
		
		double dividend1 = income * 1;
		double dividend2 = income * 0;
		double dividend3 = income * 0;

		System.out.println("Value of supply : " + ValueofSupply);
		System.out.println("Vat : " + vat);
		System.out.println("Total  : " + total);
		System.out.println("Expense  : " + expense);
		System.out.println("Income  : " + income);
		
		System.out.println("Dividend1  : " + dividend1);
		System.out.println("Dividend2  : " + dividend2);
		System.out.println("Dividend3  : " + dividend3);

	}
}
