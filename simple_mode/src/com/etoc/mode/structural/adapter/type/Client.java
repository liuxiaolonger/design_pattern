package com.etoc.mode.structural.adapter.type;

public class Client {
	public static void main(String[] args) {
		System.out.println("===============��������==============");
		Mobile mobile = new Mobile();
		mobile.charging(new VoltageAdapter());
	}
}
