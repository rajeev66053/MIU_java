package assignment5.prob2;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		this.flyBehaviour=new CannotFly();
		this.quackBehaviour=new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("displaying");
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
