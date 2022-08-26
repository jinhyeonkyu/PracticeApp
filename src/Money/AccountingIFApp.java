package Money;

public class AccountingIFApp {

	public static void main(String[] args) {
		
		double ValueofSupply = Double.parseDouble(args[0]);
		double VatRate = 0.1;
		double expenseRate = 0.3;
		double vat = ValueofSupply * VatRate;
		double total = VatRate + vat;
		double expense = ValueofSupply * expenseRate;
		double income = ValueofSupply - expense;
		
		double dividend1;
		double dividend2;
		double dividend3;
		
//		double dividend1 = income * 0.5;
//		double dividend2 = income * 0.3;
//		double dividend3 = income * 0.2;
		
		if(income > 10000.0) {
			dividend1 = income * 0.5;
			dividend2 = income * 0.3;
			dividend3 = income * 0.2;
		} else {
			dividend1 = income * 1.0;
			dividend2 = income * 0;
			dividend3 = income * 0;

		}
		

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
