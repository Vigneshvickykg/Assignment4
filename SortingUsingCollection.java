package week6.day4;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingUsingCollection {
	public static void main(String[] args) {
		String[] companyName= {"HCL","Wipro","Aspire Systems","CTS"};
	
		List<String> name=new ArrayList<String>();
		for (int i = 0; i < companyName.length; i++) {
			name.add(companyName[i]);
			
			
		}
		Collections.sort(name);
		Collections.reverse(name);
		System.out.println(name);
			
		
		
		
		
		
		
		
		
		
	}

}
