package RealTimeProjects;

import java.util.Scanner; // Import the Scanner class

public class BankDepositMachine {

	public static void main(String[] args) {
		int total = 500;

		while (true) {
			System.out.println("	WELCOME TO KVB ATM");
			Scanner s1 = new Scanner(System.in); // object creation
			System.out.println("----------------------------------");

			System.out.println("Insert your card");
			int a = s1.nextInt(); // s1 is object of scanner class
				if (a == 12369) {
					System.out.println("Enter Your PIN");

				int b = s1.nextInt(); // s1 is object of scanner class
				if (b == 1254) {
					System.out.println("----------------------------------");
					System.out.println("Choose the mode");
					System.out.println("1.Transfer		2.Deposite");
					System.out.println("3.Withdrawl		4.Balance");
					int c = s1.nextInt(); // s1 is object of scanner class
					System.out.println("----------------------------------");

					switch (c) {
					case 1:
						System.out.println("Enter the Amount:");
						int t = s1.nextInt();
						if (total > t) {
							total = total - t;
							System.out.println("Transaction Sucessfull");
							System.out.println("Account Balance:" + total);
						} else {
							System.out.println("Transaction Cancelled");
						}
						break;
					case 2:
						System.out.println("Enter the Amount:");
						int d = s1.nextInt();
						total = total + d;
						System.out.println("Deposition Sucessfull");
						System.out.println("Account Balance:" + total);
						break;
					case 3:
						System.out.println("Enter the Amount:");
						int w = s1.nextInt();
						if (total > w) {
							total = total - w;
							System.out.println("Dont forget to take your cash");
							System.out.println("Account Balance:" + total);
						} else {
							System.out.println("Transaction Cancelled");
						}
						break;
					case 4:
						System.out.println("Account Balance:" + total);
						break;

					}
				} else {
					System.out.println("IN-CORRECT PIN");
				}
			} else {
				System.out.println("RE-INSERT YOUR CARD");
			}
		}
	}
}

// nextInt() Integer
// nextFloat() Float
// nextDouble() Double
// nextLong() Long
// nextShort() Short
// next() Single word
// nextLine() Line of Strings
// nextBoolean() Boolean
