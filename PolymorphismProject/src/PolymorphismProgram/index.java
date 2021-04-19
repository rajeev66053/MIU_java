package PolymorphismProgram;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		food bucky[]=new food[2];  
		
		bucky[0]=new potpie();
		bucky[1]=new tuna();
		
		for(int x=0;x<2;x++) {
			bucky[x].eat();			
		}
		
		/*polymorphic argument*/
		
		fatty fattyObject=new fatty();
		food fo=new food();
		food po=new potpie();
		food tu=new tuna();
		
		fattyObject.digest(fo);
		fattyObject.digest(po);
		fattyObject.digest(tu);

		/*polymorphic argument*/

	}

}
