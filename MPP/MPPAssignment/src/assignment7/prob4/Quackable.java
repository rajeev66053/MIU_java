package assignment7.prob4;

public interface Quackable {
	default void quack() {
		System.out.println("I can quack");
	}
}
