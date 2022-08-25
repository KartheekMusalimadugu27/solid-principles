package learn.java.solid.isp;

import java.util.Arrays;
import java.util.List;

/**
 * @author Kartheek
 * 
 *         Imagine we get a new requirement to add another method to the Payment
 *         class. That is specific to LoanPayment class actually. Then we have
 *         to pollute the interface. Okay. But then we have to pollute the
 *         BankPayment class also since we are having interfaces here.
 * 
 *         The new method will return payment time period: for Loan => 10 yrs
 *
 */
public class ISP_Payment_New_Requiremnt_Problem {
	public interface Payment {
		void init();

		Object status();

		List<Object> getPayments();

		int getTimePeriod();
	}

	public class LoanPayment implements Payment {
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

		public int getTimePeriod() {
			return 10;
		}
	}

	public class BankPayment implements Payment {
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

		// not needed for BankPayment but we have to override
		public int getTimePeriod() {
			return 0;
		}
	}
}
