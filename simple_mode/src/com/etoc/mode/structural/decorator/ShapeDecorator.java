package com.etoc.mode.structural.decorator;

public abstract class ShapeDecorator {
	protected Shape drawAPI;

	protected ShapeDecorator(Shape drawAPI) {
		this.drawAPI = drawAPI;
	}

	public void draw() {
		drawAPI.draw();
	}
}
