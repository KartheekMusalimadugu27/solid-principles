package learn.java.solid.dip;

/**
 * @author Kartheek
 * 
 *         We have introduced an interface as the Parent for both cards. It’s
 *         BankCard. Our new shopping mall will be now able to use any BankCard
 *         and not tightly coupled with a specific card type! See the below
 *         client code.
 *
 */
public class DIP_ShoppingwithCards_Solution {

	public interface BankCard {
	    void doTransaction(double amount);
	}
	public class DebitCard implements BankCard {
	    @Override
	    public void doTransaction(double amount) {
	        System.out.println("Transaction with DebitCard: " + amount);
	    }
	}
	public class CreditCard implements BankCard {
	    @Override
	    public void doTransaction(double amount) {
	        System.out.println("Transaction with CreditCard: " + amount);
	    }
	}
	
	public class ShoppingMall {

	    private BankCard bankCard;

	    public ShoppingMall(BankCard bankCard) {
	        this.bankCard = bankCard;
	    }

	    public void purchase(double amount) {
	        this.bankCard.doTransaction(amount);
	    }

//	    public static void main(String[] args) {
//	        BankCard bankCard1 = new DebitCard();
//	        BankCard bankCard2 = new CreditCard();
//	        ShoppingMall shoppingMall = new ShoppingMall(bankCard1);
//	        // ShoppingMall shoppingMall = new ShoppingMall(bankCard2);
//	        shoppingMall.purchase(10000);
//	    }
	}
	
}
