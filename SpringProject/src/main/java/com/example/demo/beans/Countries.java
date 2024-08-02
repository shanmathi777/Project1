package com.example.demo.beans;

public class Countries {
   int id;
   String name;
   String capital;
   
   
   public Countries (int id , String name, String capital){
	   this.id=id;
	   this.name = name;
	   this.capital = capital;
   }
   
public int getId() {
	return id;
	}
  	
   
public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCapital() {
	return capital;
}

public void setCapital(String capital) {
	this.capital = capital;
}


   
}
