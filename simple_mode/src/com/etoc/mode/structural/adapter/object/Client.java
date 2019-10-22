package com.etoc.mode.structural.adapter.object;

public class Client {
	public static void main(String[] args) {
		System.out.println("===============类适配器==============");
		Mobile mobile = new Mobile();
		mobile.charging(new VoltageAdapter(new Voltage220()));
	}
}
