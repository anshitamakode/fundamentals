package com.scaler.advanced.code;

import java.util.List;

public class Runner {

	public static void main(String[] args) {
		Triple<String, Integer, String> nameToRollToEmail = new Triple<>("Rahul", 1, "rahul@gmail.com");
		Triple<String, Character, Integer> nameToFirstletterToRoll = new Triple<>("Shivam", 'S', 2);
		
		List<Triple<String, Integer, String>> nameToRollToEmails = List.of(nameToRollToEmail);
		List<Triple<String, Character, Integer>> nameToFirstletterToRolls = List.of(nameToFirstletterToRoll);
		
		for(Triple<String, Integer, String> t : nameToRollToEmails)
				System.out.println(t.getFirst()+" "+t.getSecond()+" "+t.getThird());
		
		for(Triple<String, Character, Integer> t : nameToFirstletterToRolls)
			System.out.println(t.getFirst()+" "+t.getSecond()+" "+t.getThird());
	}

}
