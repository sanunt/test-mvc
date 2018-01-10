package com.data;
 
public class User
{
String name;
String age;
String address;
String[] hobbies;

public String getName(){ return name;}
public String getAddress(){ return address;}
public String getAge(){ return age;}
public String[] getHobbies(){ return hobbies;}

public void getName(String name){ this.name=name;}
public void getAddress(String address){ this.address=address;}
public void getAge(String age){ this.age=age;}
public void getHobbies(String[] hobbies){ this.hobbies=hobbies;}

 public User() { 
    } 

public User(String name, String age, String address, String [] hobbies)
{
	this.name=name;
	this.age=age;
	this.address=address;
	this.hobbies=hobbies;
}

	@Override
	public String toString() {
		return "Name"+name+" Address"+address;
	}


}