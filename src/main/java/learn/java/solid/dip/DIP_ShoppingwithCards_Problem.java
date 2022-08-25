package learn.java.solid.dip;

/**
 * @author Kartheek
 * 
 *         You can see here, DebitCard is tightly coupled as a dependency to
 *         ShoppingMall class. We need that to perform a purchase. So what
 *         happens if someone IS NOT HAVING a DebitCard? But he/she has a
 *         CreditCard! Now again we have to change ShoppingMall class and bind a
 *         CreditCard instead of a DebitCard. Design matters a lot!
 *
 */
public class DIP_ShoppingwithCards_Problem {

	public class CreditCard {
		public void doTransaction(double amount) {
			System.out.println("Transaction with CreditCard: " + amount);
		}
	}

	public class DebitCard {
		public void doTransaction(double amount) {
			System.out.println("Transaction with DebitCard: " + amount);
		}
	}

	public class ShoppingMall {

		private DebitCard debitCard;

		public ShoppingMall(DebitCard debitCard) {
			this.debitCard = debitCard;
		}

		public void purchase(double amount) {
			this.debitCard.doTransaction(amount);
		}

//	    public static void main(String[] args) {
//	        DebitCard debitCard = new DebitCard();
//	        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
//	        shoppingMall.purchase(10000);
//	    }
	}

}
