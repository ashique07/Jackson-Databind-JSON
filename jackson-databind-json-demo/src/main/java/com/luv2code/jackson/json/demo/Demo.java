package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			ObjectMapper objectMapper = new ObjectMapper();
			
			Student theStudent = objectMapper.readValue(new File("data/sample-full.json"), Student.class);
			
			System.out.println(theStudent.getFirstName());
			System.out.println(theStudent.getLastName());
			System.out.println(theStudent.getId());
			System.out.println(theStudent.getAddress().getCountry());
			System.out.println(theStudent.getAddress().getCity());
			
			for(String tempLanguage: theStudent.getLanguages())
			{
				System.out.println(tempLanguage);
			}
			
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}