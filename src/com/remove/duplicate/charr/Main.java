package com.remove.duplicate.charr;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        String str = "programming";
        
        // Create a LinkedHashSet to store unique characters in order
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();
        
        // Add each character from the string to the set
        for (int i = 0; i < str.length(); i++) {
            charSet.add(str.charAt(i));
        }
        
        // Build the final result string
        StringBuilder sb = new StringBuilder();
        for (Character ch : charSet) {
            sb.append(ch);
        }
        
        System.out.println("Original: " + str);
        System.out.println("Without duplicates: " + sb.toString());
    }
}

