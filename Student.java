package com.usearelation.p1;

public class Student <t> {
             String t ;
             char gender;
			public Student(String t, char gender) {
				super();
				this.t = t;
				this.gender = gender;
			}
			
             public String getT() {
				return t;
			}

			public void setName(String name) {
				this.t = t;
			}
            
			public char getGender() {
				return gender;
			}

			public void setGender(char gender) {
				this.gender = gender;
			}

			Pen writepoem(String originalpoetname,double price) {
            	 System.out.println(t+" is writing poem written by the original poet named "+originalpoetname);
            	Pen p1=new Pen("cello",1000.00,00.00);
            	 //Pen p2=new Pen("brite",450.00,50.0);
            	 if(price>=p1.price) {
            		 System.out.println("you can afford this pen");
            		 return p1;
            	 }
            	 else 
            		 return null;
             }
}
