package com.javaex.ex04;

public class RectTriangle extends Shape {
	// 필드
    private double width;
    private double height;
    
    // 생성자
    public RectTriangle() {
    }
    
    public RectTriangle(double width, double height) {
    	this.width = width;
    	this.height = height;
    }
    
    // getter, setter
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	// 추상클래스에서 상속받은 추상메서드 구현 해야한다.
	@Override
	public double getArea() { // 직각 삼각형 넓이
		return width * height * 0.5;
	}

	@Override
	public double getPerimeter() { // 직각 삼각형 둘레
		return width + height + Math.sqrt(width * width + height * height); // mat.sqrt가 루트 씌우는 공식
	}

	
    
}