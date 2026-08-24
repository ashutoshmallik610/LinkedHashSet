package com.sample;

import java.util.LinkedHashSet;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {


		Set<String> set = new LinkedHashSet<String>();
		
		set.add("BLR");
		set.add("CHE");
		set.add("GGN");
		set.add("DL");
		set.add("OD");
		set.add("BLR");
		
		System.out.println(set);

	}

}
