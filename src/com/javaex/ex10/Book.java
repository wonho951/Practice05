package com.javaex.ex10;

public class Book {
    
    //필드
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;

	
	//생성자
	public Book () {
		
	}
	
	
	public Book (int bookNo, String title, String author, int stateCode) {		
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}
	
	
	//메소드 g/s
	public int getBookNo() {
		return bookNo;
	}


	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}	
	
	//메소드 - 일반
    
	public void rent() {
		int stateCode = 0;
		System.out.println(title + " 이(가) 대여 됐습니다.");
	}
	
	public void print() {
		if (stateCode == 0) {
			System.out.println("대여중");
		} else {
			System.out.println("재고있음");
		}
	}
	
	
	
	
	
    
	
	
	
    
}
