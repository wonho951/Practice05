package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member jung = new Member("jws", "정우성", 50000);
		jung.showInfo();
				
		Member yoo = new Member("yjs", "유재석", 50000);
		yoo.showInfo();
		
		Member lee = new Member("lhr", "이효리", 50000);
		lee.showInfo();
	}

}
