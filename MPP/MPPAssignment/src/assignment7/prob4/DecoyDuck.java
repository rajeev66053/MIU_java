package assignment7.prob4;

public class DecoyDuck extends Duck{
	DecoyDuck(){
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am Decoy Duck");
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("I cannot quack");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I cannot fly");
	}
	
}
