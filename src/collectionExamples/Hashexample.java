package collectionExamples;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Hashexample {
	
	public static void main(String args[]) {
		List<Integer> ls = new ArrayList<>();
		ls.add(1);
		ls.add(12);
		ls.add(11);
		//System.out.println(ls);
		
		ArrayList<Integer> lsm = new ArrayList<>(Arrays.asList(1,2,1,4,2,4,3,1));
		Set<Integer> set = new HashSet<Integer>(lsm);
		System.out.println(lsm);
		
		int count=0;
		for(Integer i : set) {
			count=0;
			for(int j=0; j< lsm.size(); j++) {
				if(i.intValue()== lsm.get(j))
				{
					
					if(count> 0)
						lsm.set(j, lsm.get(j)+(10*lsm.get(j)));
					count++;
				}
			}
			System.out.println("Count of element ["+i.intValue()+"] = "+count);
		}
		
		System.out.println(lsm);
		//List<String>  str = new ArrayList<>();
		
		
		
		
		
		
	}

}
