package com.etoc.mode.structural.bridge;

public class Client {
	public static void main(String[] args) {
		AbsPhone phone=new Flat(new Vivo());
		System.out.println("平板手机：品牌vivo");
		phone.music();
		phone.photograph();
		AbsPhone phone1=new Flat(new Oppo());
		System.out.println("平板手机：品牌oppo");
		phone1.music();
		phone1.photograph();
	}
}
