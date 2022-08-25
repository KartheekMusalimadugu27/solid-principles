package learn.java.solid.isp;

import java.util.Arrays;
import java.util.List;

public class ISP_Payment_SOlution {

	public interface Payment {
		void init();

		Object status();

		List<Object> getPayments();
	}

	public interface Loan extends Payment {
		int getTimePeriod();
	}

	public interface Bank extends Payment {
		int getOutstandingBalance();
	}

	public class LoanPayment implements Loan {
		@Override
		public int getTimePeriod() {
			return 10;
		}

		@Override
		public void init() {
			System.out.println("Initiate LoanPayment...");
		}

		@Override
		public Object status() {
			return "LoanPayment Status";
		}

		@Override
		public List<Object> getPayments() {
			return Arrays.asList("LoanPayment1", "LoanPayment2");
		}
	}

	public class BankPayment implements Bank {
		@Override
		public int getOutstandingBalance() {
			return 1000;
		}

		@Override
		public void init() {
			System.out.println("Initiate BankPayment...");
		}

		@Override
		public Object status() {
			return "BankPayment Status";
		}

		@Override
		public List<Object> getPayments() {
			return Arrays.asList("BankPayment1", "BankPayment2");
		}
	}

}
