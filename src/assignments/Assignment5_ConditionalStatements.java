package assignments;

public class Assignment5_ConditionalStatements {

	public static void main(String[] args) {
		String customerName = "John Doe";
		int creditScore = 800;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;

		System.out.println(customerName+" Loan Details");

		if(creditScore>750) 
		{
			System.out.println("Loan Approved");	
		}
		else if(creditScore >=650) {

			if (income>50000.0) {

				if(isEmployed) {
					if(debtToIncomeRatio<40.0) {
						System.out.println("Loan got Approved After Cheks Peformed");

					}
					else {
						System.out.println("Loan Denied Due to high debtToIncomeRatio");
					}
				}
				else {
					System.out.println("Not a Employee");
				}


			}
			else {
				System.out.println("Loan Denied due to income<50000");
			}


		}
		else {
			System.out.println("Loan Denied due to low credit score");
		}


	}


}







