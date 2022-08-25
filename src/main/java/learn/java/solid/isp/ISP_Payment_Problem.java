package learn.java.solid.isp;

import java.util.Arrays;
import java.util.List;

/**
 * @author Kartheek
 * 
 *         We have a Payment interface to represent all types of payments.
 *         BankPayment and LoanPayment are the implemented children from
 *         Payment.
 *
 */
public class ISP_Payment_Problem {
	public interface Payment {
		void init();

		Object status();

		List<Object> getPayments();
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
	}
}
