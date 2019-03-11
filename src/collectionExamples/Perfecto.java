package collectionExamples;

import java.util.ArrayList;

public class Perfecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 1; i <= 1000; i++) 
			al.add(i);
		
		//System.out.println(al);
		
		
		int a[] = null;
		int aladd = 0;
		int i, j = 0;

		for (i = 0; i < 1000; i++) {
			j = al.get(i);
			aladd = 0;
			for (int k = 0; k < al.get(i)/2; k++)
			{
				if (j % al.get(k) == 0) {
					aladd = aladd + al.get(k);
					//System.out.println("****"+j+" mod "+al.get(k));
				}
				//System.out.println("*******"+aladd);
			}

			if (aladd == j) {
				System.out.println("---------" + aladd);
			}
		}

		

	}

}
