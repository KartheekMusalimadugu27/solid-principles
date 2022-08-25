package learn.java.solid.lsp;

public abstract class SocialMedia {
	abstract void chat(String user);

	abstract void publish(Object post);

	abstract void groupCall(String... users);
}
