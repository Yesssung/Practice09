package com.javaex.ex03;

public class Goods {

	// 필드
	private String name;
	private int price;
	private int count;
	
	// 생성자
	public Goods(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	// 메소드
	public void showInfo() {
		System.out.printf("%s(가격: %d원)이 %d개 입고 되었습니다.", name, price, count);
	}
	

	

}
