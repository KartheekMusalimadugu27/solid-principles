package learn.java.solid.lsp;

/**
 * @author Kartheek
 *
 *         This is said to be the toughest principle to understand by the
 *         majority of developers. This was introduced by Barbara Liskov. It
 *         applies to inheritance in such a way that the derived classes must be
 *         completely substitutable for their base classes.
 * 
 *         If class A is a subtype of class B, then we should be able to replace
 *         B with A without interrupting the behavior of the program.
 * 
 *         Let’s understand this with an example…But let me tell you: this
 *         principle will make the article more lengthy :D
 * 
 *         Let’s assume we are going to manage multiple types of Social Media
 *         platforms. They are Facebook, Instagram, and WhatsApp.
 * 
 * 
 *         Did you notice that doing this way, some platforms had to maintain
 *         responsibilities even if that responsibility is not supported by the
 *         platform! Let me explain…
 * 
 *         Facebook: support all actions
 * 
 *         WhatsApp: does not support publish posts
 * 
 *         Instagram: does not support groupCall
 * 
 *         So, in this case, Instagram or WhatsApp can not be completely
 *         substitutable with SocialMedia class!
 * 
 *         Let’s apply LSP here.
 *
 * 
 * 
 */
public class LSP_Problem {
	public class Facebook extends SocialMedia {
		@Override
		void chat(String user) {

		}

		@Override
		void publish(Object post) {

		}

		@Override
		void groupCall(String... users) {

		}
	}

	public class Instagram extends SocialMedia {
		@Override
		void chat(String user) {

		}

		@Override
		void publish(Object post) {

		}

		@Override
		void groupCall(String... users) {

		}
	}

	public class WhatsApp extends SocialMedia {
		@Override
		void chat(String user) {

		}

		@Override
		void publish(Object post) {

		}

		@Override
		void groupCall(String... users) {

		}
	}
}
