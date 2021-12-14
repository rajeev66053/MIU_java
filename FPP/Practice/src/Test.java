interface I1
{
	void show();
}

interface I2
{
	void display();
}

class Test implements I1,I2
{
	public void show()
	{
		System.out.println("show");
	}

	public void display()
	{
		System.out.println("display");
	}

	public static void main(String[] args){

		Test t=new Test();
		t.show();
		t.display();
	}


}