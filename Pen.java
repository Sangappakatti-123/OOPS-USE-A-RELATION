package com.usearelation.p1;
public class Pen {
    String brand;
    double price;
    double lifetime;
	public Pen(String brand, double price, double lifetime) {
		
		this.brand = brand;
		this.price = price;
		this.lifetime = lifetime;
	}
	
	 void checkpencondition() {
	     if(this.lifetime>150.00) {
		System.out.println("Pen stops writing");
	}
	else {
		System.out.println("Pen is writing");
	}}
	
	void write() {
		System.out.println("writing Poems.........");}
	
    
}


