package com.test;

public class MethodOverridingApplication {
  public static void main(String[] args) {
		
		  Circle c = new Circle(); 
		  c.draw(); 
		  c.numberOfSides();
		  
		  Box b = new Box(); 
		  b.draw(); 
		  b.numberOfSides();
		  
		  Triangle t = new Triangle();
		  t.draw(); 
		  t.numberOfSides();
		 
  }
	  
}
