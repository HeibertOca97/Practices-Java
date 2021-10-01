package com.clearminds.test;

import com.clearminds.models.User;

public class UserTest {

	public static void main(String[] args) {
		User u1 = new User("user1", "12345");
		System.out.println("********** 1 **********");
		System.out.println("Username: " + u1.getUsername());
		System.out.println("Password: " + u1.getPassword());
		u1.setAge(17);
		System.out.println("Edad: " + u1.getAge());
		u1.setYear_birth(1997);
		System.out.println("Year of birth: " + u1.getYear_birth());
		
		User u2 = new User("user2", "12345");
		System.out.println("********** 2 **********");
		System.out.println("Username: " + u2.getUsername());
		System.out.println("Password: " + u2.getPassword());
		u2.setAge(17);
		System.out.println("Edad: " + u2.getAge());
		u2.setYear_birth(2000);
		System.out.println("Year of birth: " + u2.getYear_birth());
		
	}

}
