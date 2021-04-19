package assignment7.prob4;

public interface Flyable {
	default void fly() {
		System.out.println("I can fly with wings");
	}
}
