package com.javaex.ex02;

public class Goods {

	//필드
	private String name;
	private int price;
	
	
	//생성자
	public Goods() {
		
	  }
	
	public Goods(String name) {
		this.name = name;
	}
	
	public Goods(int price) {
		this.price = price;
	}
	
	public Goods(String name, int price) {
		this.name = name ;
		this.price = price;
	}

	
	//메소드gs
	public String getNema() {
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
	
	//메소드
	
	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}
	
}




