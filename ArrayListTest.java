package com.obsqura.training.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("Violet");
		arrlist.add("Indigo");
		arrlist.add("Blue");
		arrlist.add("Green");
		arrlist.add("Yellow");
		arrlist.add("Orange");
		arrlist.add("Red");
		
		Collections.sort(arrlist); //to sort the contents of arraylist ..(automatically ascending order itself)
		
		/*for(int i=0;i<arrlist.size();i++) //print using for loop
		{
			System.out.println(arrlist.get(i));
		}		
		
		for(String clr:arrlist)   //print using for each loop
			{System.out.println(clr);}*/
		System.out.println(arrlist);
		Iterator<String> itr = arrlist.iterator();//print using iterator
		while(itr.hasNext())
			System.out.println(itr.next());	
		
		System.out.println("Element at fourth idex: "+arrlist.get(3));
		
		arrlist.remove(2);//to remove an element from arraylist at specific index
		System.out.println("New arraylist after removal: ");
		for(String nwclr:arrlist)
			System.out.println(nwclr);
		
		if(arrlist.contains("Blue"))//to search for an element
			System.out.println("Element found");
		else
			System.out.println("Element not found");
	}

}


