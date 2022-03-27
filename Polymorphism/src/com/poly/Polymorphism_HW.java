package com.poly;

class AddOverload
{
	void add(int i,int j)
	{
		int s;
		s=i+j;
		System.out.println("The sum of "+i+" and "+j+" is" +s);
	}
	void add(float i,float j)
	{
	float f;
	f=i+j;
	System.out.println("The sum of '+i' and '+j+' is" +f);
	}
	void add(double i, double j)
	{
		double d;
		d=i+j;
		System.out.println("The sum of 'i' and 'j' is" +d);
	}
	
	}

public class Polymorphism_HW {
	public static void main(String[] args) {
		AddOverload ob=new AddOverload();
		ob.add(3, 4);
		ob.add(6.8f, 6.9f);
		ob.add(4, 7);
		

	}

}
