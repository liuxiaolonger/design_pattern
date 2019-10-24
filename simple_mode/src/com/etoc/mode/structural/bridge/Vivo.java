package com.etoc.mode.structural.bridge;

public class Vivo implements Brand {
	@Override
	public void photograph() {
		System.out.println("像素1800");
	}

	@Override
	public void music() {
		 System.out.println("HiFi音质");
	}

}
