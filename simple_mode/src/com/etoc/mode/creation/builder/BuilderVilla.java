package com.etoc.mode.creation.builder;

/**
 * ����ͨ��¥
 * 
 * @author Administrator
 *
 */
public class BuilderVilla implements BuilderHouse {
	public House h = new House();

	@Override
	public void Foundation() {
		h.Foundation = "��׮,�������";
		System.out.println("��׮,�������");
	}

	@Override
	public void wall() {
		h.wall = "����ĭש��ǽ";
		System.out.println("����ĭש��ǽ");
	}

	@Override
	public void capping() {
		h.capping = "�ֽ��ⶥ";
		System.out.println("�ֽ��ⶥ");
	}

	@Override
	public House createHouse() {
		// TODO Auto-generated method stub
		return h;
	}

}
