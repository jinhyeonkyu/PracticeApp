package Money;

public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		double ValueofSupply = Double.parseDouble(args[0]);
		double VatRate = 0.1;
		double expenseRate = 0.3;
		double vat = ValueofSupply * VatRate;
		double total = VatRate + vat;
		double expense = ValueofSupply * expenseRate;
		double income = ValueofSupply - expense;
		
		
		double[] dividiendRates = new double[3];
		dividiendRates[0] = 0.5;
		dividiendRates[1] = 0.3;
		dividiendRates[2] = 0.2;
		
		double dividend1 = income * dividiendRates[0];
		double dividend2 = income * dividiendRates[1];
		double dividend3 = income * dividiendRates[2];
		
		
		int i =0;
		while(i < dividiendRates.length) {
			System.out.println("dividend1 :" + (income * dividiendRates[i]));
			i= i+1;
		}

//		System.out.println("Value of supply : " + ValueofSupply);
//		System.out.println("Vat : " + vat);
//		System.out.println("Total  : " + total);
//		System.out.println("Expense  : " + expense);
//		System.out.println("Income  : " + income);
//		
//		System.out.println("Dividend1  : " + dividend1);
//		System.out.println("Dividend2  : " + dividend2);
//		System.out.println("Dividend3  : " + dividend3);

	}
}
