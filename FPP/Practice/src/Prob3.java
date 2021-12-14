package prob3;

import java.util.ArrayList;
import java.util.List;

public class ArtCreationData {
	//Creates a common list of all art types; return value is used in computeNumberArtWorks
	public List<ArtCount>/*insert type*/ assembleCommonArt(List<FineArt> fineArtWorks, List<WebArt> webArtWorks) {
		//implement
		List<ArtCount> list = new ArrayList<ArtCount>();
		for(var fa:fineArtWorks) {
			list.add(fa);
		}
		for(var wa:webArtWorks) {
			list.add(wa);
		}
		return list;
	}
	
	
	//Polymorphically totals number of WebArt and FineArt pieces
	//of art and returns this number
	//You may not refer to the WebArt 
	public int computeNumberArtWorks(List<ArtCount>/*insert type*/ list) {
		//implement 
		int totalCount=0;
		for(ArtCount artCount:list) {
			totalCount+=artCount.numArtPieces();
		}
		return totalCount;
	}
}