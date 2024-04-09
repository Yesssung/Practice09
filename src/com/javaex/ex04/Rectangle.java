package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
	
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
    	this.width = width;
    	this.height = height;
    }
    
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void resize(double s) {
		width  = width * s;
		height = height * s;
	}

	@Override
	public double sum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int width() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int height() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
	
	
	
    
    

}