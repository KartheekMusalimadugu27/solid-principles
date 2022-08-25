package learn.java.solid.ocp;

/**
 * @author Kartheek
 * 
 *         This principle states that according to new requirements the module
 *         should be open for extension but closed for modification. We should
 *         be able to add an extension to the existing code, without changing
 *         the original basic implementation which makes us easier to extend
 *         logic.
 * 
 *         Let’s say we have a service to send notifications to various mediums
 *         named as NotificationService. You remember the previous example…Am I
 *         correct? So, look at that Service. There we had two ways to send OTP
 *         notifications. They were mobile and email. What happens if a new
 *         requirement comes to send OTP notifications through WhatsApp. Just
 *         imagine…What should we do? We have to modify the code original
 *         Service! This violates OCP!!!
 * 
 * 
 *
 */
public class OCP_NotificationService_Problem {

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
