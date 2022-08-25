package learn.java.solid.ocp;

/**
 * @author Kartheek
 * 
 *         Let’s apply OCP to this scenario. I’m going to reimplement this
 *         NotificationService class. It should be an interface actually. Then I
 *         will implement the interface into another 3 services called
 *         MobileNotificationService, EmailNotificationService, and
 *         WhatsAppNotificationService.
 *
 */
public class OCP_NotificationImplService_Solution {

	public interface NotificationServices {
		void sendOTP(String medium);

		void sendTransactionHistory(String medium);
	}

	public class MobileNotificationService implements NotificationServices {
		@Override
		public void sendOTP(String medium) {
			System.out.println("Sending OTP Number Message to: " + medium);
		}

		@Override
		public void sendTransactionHistory(String medium) {
			System.out.println("Sending Transactions Message to: " + medium);
		}
	}

	public class EmailNotificationService implements NotificationServices {
		@Override
		public void sendOTP(String medium) {
			System.out.println("Sending OTP Number Email to: " + medium);
		}

		@Override
		public void sendTransactionHistory(String medium) {
			System.out.println("Sending Transactions Email to: " + medium);
		}
	}

	public class WhatsAppNotificationService implements NotificationServices {
		@Override
		public void sendOTP(String medium) {
			System.out.println("Sending OTP Number to: " + medium);
		}

		@Override
		public void sendTransactionHistory(String medium) {
			System.out.println("Sending Transactions Details to: " + medium);
		}
	}

}
