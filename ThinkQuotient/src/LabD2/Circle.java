package LabD2;

class Operation{  
	 int square(int n){  
	  return n*n;  
	 }  
}  
	  
class Circle{  
	 Operation op;//aggregation  
	 double pi=3.14;  
	    
	 double area(int rad){  
	   op=new Operation();  
	   int rsquare=op.square(rad);  
	   return pi*rsquare;  
	 }  
 
	 public static void main(String args[]){  
	   Circle c=new Circle();  
	   double result=c.area(5);  
	   System.out.println(result);  
	 }  
}  
