package com.etoc.mode.creation.builder;

public interface BuilderHouse {
	public void Foundation();

	public void wall();

	public void capping();

	public House createHouse();
}
