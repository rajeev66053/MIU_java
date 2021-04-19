package assignment5.prob2;

public abstract class Duck{
	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackBehaviour;

	abstract void display();
	abstract void fly();
	abstract void quack();
	abstract void swim();
}
