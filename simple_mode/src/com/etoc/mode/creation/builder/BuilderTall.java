package com.etoc.mode.creation.builder;

/**
 * ����¥����
 * 
 * @author Administrator
 *
 */
public class BuilderTall implements BuilderHouse {
	public House h = new House();

	@Override
	public void Foundation() {
		h.Foundation = "�û�������ػ�";
		System.out.println("�û�������ػ�");
	}

	@Override
	public void wall() {
		h.wall = "�ú�שˮ�ཨǽ";
		System.out.println("�ú�שˮ�ཨǽ");
	}

	@Override
	public void capping() {
		h.capping = "�ú켪�߷ⶥ";
		System.out.println("�ú켪�߷ⶥ");
	}

	@Override
	public House createHouse() {
		// TODO Auto-generated method stub
		return h;
	}

}
