package com.test;

public class ShapesDraw {

	public static void main(String[] args) {
		// Write a Java program to create an interface Drawable with a method draw() that takes no arguments and returns void. 
		//Create three classes Circle, Rectangle, and Triangle that implement the Drawable interface and override the draw() method to
		//draw their respective shapes.
		Circle c= new Circle();
		Rectangle r= new Rectangle();
		Triangle t=new Triangle();
		
		c.draw();
		r.draw();
		t.draw();

	}

}
interface Drawable
{
	public void draw();
	
}
class Circle implements Drawable
{
	public void draw()
	{
		System.out.println("This is Circle");
	}
}
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("This is Rectangle");
	}
}
class Triangle implements Drawable
{
	public void draw()
	{
		System.out.println("This is Traingle");
	}
}
