package assignment5.prob2;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		this.flyBehaviour=new FlyWithWings();
		this.quackBehaviour=new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("display");
	}
	@Override
	public void fly() {
		System.out.println(flyBehaviour.fly());
	}
	@Override
	public void quack() {
		System.out.println(quackBehaviour.quack());
	}
	@Override
	public void swim() {
		System.out.println("swimmimg");
	}

}
