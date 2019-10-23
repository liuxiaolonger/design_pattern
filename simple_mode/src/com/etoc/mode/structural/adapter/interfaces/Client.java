package com.etoc.mode.structural.adapter.interfaces;

public class Client {
	public static void main(String[] args) {
		  Adapter adapter = new Adapter() {
			  @Override
			public void interfaces1() {
			System.out.println("只实现感兴趣？哈哈哈哈");
			}
		};
		adapter.interfaces1();
	}
}
