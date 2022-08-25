package learn.java.solid.lsp;

import java.util.Arrays;

/**
 * @author Kartheek
 *
 *         You can see now SocialMedia is an interface with common
 *         responsibility called chat(). So, we have separate interfaces to
 *         manage video calls and publishing posts. This way all subclasses:
 *         Facebook and WhatsApp perform the actions that they can only do!
 * 
 *         WhatsApp is a child to both SocialMedia and VideoCallManager Facebook
 *         is a child to both SocialMedia and PostManager Let’s check with the
 *         definition:
 * 
 *         If class WhatsApp is a subtype of class SocialMedia, then we should
 *         be able to replace SocialMedia with WhatsApp without interrupting the
 *         behavior of the program. OK!!!
 * 
 *         We are completely fine to replace SocialMedia with WhatsApp We are
 *         completely fine to replace SocialMedia with Facebook
 *
 */
public class LSP_Solution {

	public interface SocialMedia {
		void chat(String user);
	}

	public interface PostManager {
		void publish(Object post);
	}

	public interface VideoCallManager {
		void groupCall(String... users);
	}

	public class Facebook implements SocialMedia, PostManager {
		@Override
		public void publish(Object post) {
			System.out.println("Publishing a post on Facebook: " + post);
		}

		@Override
		public void chat(String user) {
			System.out.println("Chatting on Facebook with: " + user);
		}
	}

	public class WhatsApp implements SocialMedia, VideoCallManager {
		@Override
		public void chat(String user) {
			System.out.println("Chatting on WhatsApp with: " + user);
		}

		@Override
		public void groupCall(String... users) {
			System.out.println("Taking a Group Call on WhatsApp with: " + Arrays.toString(users));
		}
	}

}
