package seventh_assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Marketting> mt=new ArrayList<>();
		mt.add(new Marketting("Harry","Iphone",30000));
		mt.add(new Marketting("David","Ipod",12000));
		mt.add(new Marketting("Paul","Nike",800));
		mt.add(new Marketting("Brad","Columbus",3500));
		mt.add(new Marketting("John","Xiomi",600));
		mt.add(new Marketting("Andy","Pixel",1100));
		
		System.out.println("After adding in the list, the list has size :"+mt.size()+" with following list"+mt);
				
//		mt.remove(1);	
//
//		System.out.println("The list with size :"+mt.size()+" after removing 1st index object has following list"+mt);

		Marketting removeObj=new Marketting("Brad","Columbus",3500);
		mt.remove(removeObj);	

		System.out.println("The list with size :"+mt.size()+" after removing specific object has following list"+mt);
		

		mt.add(new Marketting("Michel","Canvas",700));
		
		System.out.println("After adding in the list, the list has size :"+mt.size()+" with following list"+mt);
		
		
		SalesComparator sc=new SalesComparator();
		Collections.sort(mt, sc);
		
		System.out.println("Marketting order by sales amount");
		System.out.println(mt);
		
		List<Marketting> listMoreThan1000=listMoreThan1000(mt);
		
		NamesComparator nc=new NamesComparator();
				
		Collections.sort(listMoreThan1000,nc);
		
		System.out.println("Marketting order by sales amount more than 1000");
		System.out.println(listMoreThan1000);
		
	}
	
	
	public static List<Marketting> listMoreThan1000(List<Marketting> list){
		 // Implement a body
		
			List<Marketting> moreThan100=new ArrayList<>();
			
			for(Marketting m:list) {
				
				if(m.getSalesAmount()>1000) {
					moreThan100.add(m);
				}
			}
			return moreThan100;
		}
	
}
