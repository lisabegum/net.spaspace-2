package net.ssqa.utils;

import com.github.javafaker.Faker;

public final class GenerateData {

	private GenerateData() {
	}

	public static String randomFirstName() 
	{
		Faker faker = new Faker();
		return faker.name().firstName();
	}

	public static String randomEmail() 
	{
		Faker faker = new Faker();
		return faker.internet().emailAddress();
	}

}
