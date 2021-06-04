package com.javaex.ex05;

public class PrintApp {

    public static void main(String[] args) {

        Print print = new Print();
        
        print.printer(10);    // 정수 --> 이미 있음
        print.printer(true);  // 논리 --> boolean
        print.printer(5.7);   // 실수 --> float || double
        print.printer("홍길동");  // char 불가 --> String
        
    }

}
