package learn.java.solid.srp;

/**
 * @author Kartheek
 * 
 *         Each class is performing its own actions. This way, the code looks
 *         more clear and understandable. That’s all about SRP!
 *
 */
public class SRP_BankService_Solution {

	// BankService
	public class BankService {
		public void withdraw(double amount) {
			System.out.println("Withdraw money : " + amount);
		}

		public void deposit(double amount) {
			System.out.println("Deposit money : " + amount);
		}
	}

	// LoanService
	public class LoanService {
		public String getLoanInfo(String loanType) {
			if (loanType.equals("professional")) {
				return "Professional Loan";
			} else if (loanType.equals("home")) {
				return "Home Loan";
			} else {
				return "Personal Loan";
			}
		}
	}

	// PrinterService
	public class PrinterService {
		public void printPassbook() {
			System.out.println("Printing Book Details...");
		}
	}

	// NotificationService
	public class NotificationService {
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

}
