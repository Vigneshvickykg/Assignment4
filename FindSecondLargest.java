package week6.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> values=new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			values.add(data[i]);
			
			
			
		}
		List<Integer> output=new ArrayList<Integer>(values);
		System.out.println(output.get(output.size()-2));
	}

}
