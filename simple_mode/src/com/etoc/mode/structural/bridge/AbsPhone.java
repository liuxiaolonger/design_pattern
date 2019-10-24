package com.etoc.mode.structural.bridge;

public abstract class AbsPhone {
	public  Brand brand;

	protected AbsPhone(Brand brand) {
		this.brand = brand;
	}

	protected void photograph() {
		brand.photograph();
	}

	protected void music() {
		brand.music();
	}
}
