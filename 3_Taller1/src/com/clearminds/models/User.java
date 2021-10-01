package com.clearminds.models;

public class User {
	//ATTRIBUTE
	private String username;
	private String password;
	private int age;
	private int year_birth;
	
	//CONSTRUCT	
	public User(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	//GETTER - SETTER
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(this.age > 17){
			this.age = age;			
		}else{
			System.out.println("Eres menor de edad");
		}
	}
	
	public int getYear_birth() {
		return year_birth;
	}
	
	public void setYear_birth(int year_birth) {
		this.year_birth = year_birth;
	}
	
	
		
}
