package day8;

import java.util.ArrayDeque;

public class RemoveFirstElemInQueue {

	public static void main(String[] args) {
		 ArrayDeque<String> ad = new ArrayDeque<String>();
	        ad.add("thanveer");
	        ad.add("khan");
	        ad.add("guru");
	        ad.add("kumar");
	       // ad.pollFirst();
	     //  ad.pollLast();
	       ad.addFirst("jumanji");
	       System.out.println(ad);
	        
	     
	}

}
