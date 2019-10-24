package com.etoc.mode.structural.bridge;

public class OverFlip extends AbsPhone {

	public OverFlip(Brand brand) {
		super(brand);
	}

	public void photograph() {
		brand.photograph();
	}

	public void music() {
		brand.music();
	}

}
