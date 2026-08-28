package com.findFirst;

import java.util.LinkedHashSet;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Iterator;
//import java.util.List;

public class Main {
    public static void main(String[] args) 
   {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(50);
        set.add(20);
        set.add(80);
        set.add(10);
        set.add(40);

        // Find the first inserted element
        if (!set.isEmpty()) {
            Integer firstElement = set.iterator().next();
            System.out.println("First inserted element: " + firstElement);
        } 
        else 
        {
            System.out.println("The set is empty.");
        }
    	
//    		List<String> list = Arrays.asList("a", "b", "c", "d");
//    
//    		    		
//    		Iterator<String> itr = list.iterator();
//    		
//    		
//    		while(itr.hasNext())
//    		{
//    			String lists = itr.next();
//    	
//    			if(lists.equals("c"))
//    			{
//    				itr.remove();
//    			}
//    		}
    		
    		
    }
}

