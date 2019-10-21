package com.etoc.mode.structural.decorator;

public class RedShapeDecorator extends ShapeDecorator {

	protected RedShapeDecorator(Shape drawAPI) {
		super(drawAPI);
	}
	 @Override
	   public void draw() {
		  drawAPI.draw();         
	      setRedBorder(drawAPI);
	   }
	 
	   private void setRedBorder(Shape decoratedShape){
	      System.out.println("Border Color: Red");
	   }
}
