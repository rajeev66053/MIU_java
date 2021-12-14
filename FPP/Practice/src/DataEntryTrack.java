import java.util.List;

public class DataEntryTrack{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var myLinkList = new MyLinkList<String>();
		myLinkList.add("Straight");
		myLinkList.add("Bent");
		myLinkList.add("Equals");
		myLinkList.add("Well");
		myLinkList.add("Storm");	
		System.out.println(myLinkList);
		System.out.println(myLinkList.find("Well"));
		System.out.println(myLinkList.find("Strength"));
		System.out.println(myLinkList.find("Storm"));
	}

}