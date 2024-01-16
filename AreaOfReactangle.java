package com.test;

import java.util.Scanner;

public class AreaOfReactangle {

	public static void main(String[] args) {
		//Write a Java program to create a class called Shape with a method called getArea(). 
		//Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length");
		int length=sc.nextInt();
		System.out.println("Enter width");
		int width=sc.nextInt();
		Rectangle r=new Rectangle(length,width);
		int ans=r.getArea();
		
	}
	

}
class Shape
{
	int length;
	int width;
	public void getArea()
	{
		int area=length*width;
		System.out.println("Area of reactangle is:"+area);
	}
}
class Rectangle extends Shape
{
	int length;
	int width;
	public Rectangle(int length, int width) {
		this.length = length;
	    this.width = width;
	}
	public void getArea()
	{
		int area=length*width;
		System.out.println("Area of reactangle is:"+area);
	}
}
