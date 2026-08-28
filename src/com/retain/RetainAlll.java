package com.retain;

import java.util.LinkedHashSet;

public class RetainAlll 
{
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> list = new LinkedHashSet<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		LinkedHashSet<Integer> list1 = new LinkedHashSet<Integer>();
		
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		list1.add(70);
		
		list.removeAll(list1);
		
		System.out.println(list);
		
		
	}
	
	
	
}
