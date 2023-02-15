package com.usearelation.p1;

public class Mainclass {
    public static void main(String[]args) {
    	Student <Integer> s1=new Student<Integer>("Einstein ",'M');
    	
    	Pen p2=s1.writepoem("Words worth",9199.00);
    	if(p2!=null) {
    		p2.checkpencondition();
    	}
    	
    	
    	
    }
}
