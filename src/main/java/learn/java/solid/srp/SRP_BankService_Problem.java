package learn.java.solid.srp;

/**
 * @author Kartheek
 *
 *         This principle states that every Java class must perform a single
 *         functionality. Here, single functionality means: class has to perform
 *         actions that belong only to that class.
 * 
 *         Let’s say we have a class called BankService. Before SRP is applied,
 *         it will be like this. All the actions including deposit, withdrawal,
 *         sending notifications, printing the passbook are done by BankService.
 *         This way, BankService class has multiple responsibilities which are
 *         not related to each other.
 *
 */
public class SRP_BankService_Problem {

	public void withdraw(double amount) {
		System.out.println("Withdraw money : " + amount);
	}

	public void deposit(double amount) {
		System.out.println("Deposit money : " + amount);
	}

	public String getLoanInfo(String loanType) {
		if (loanType.equals("professional")) {
			return "Professional Loan";
		} else if (loanType.equals("home")) {
			return "Home Loan";
		} else {
			return "Personal Loan";
		}
	}

	public void printPassbook() {
		System.out.println("Printing Book Details...");
	}

	public void sendOTP(String medium) {
		if (medium.equals("mobile")) {
			System.out.println("Sending OTP to mobile");
		} else if (medium.equals("email")) {
			System.out.println("Sending OTP to email");
		} else {
			System.out.println("Not a valid medium");
		}
	}

}
