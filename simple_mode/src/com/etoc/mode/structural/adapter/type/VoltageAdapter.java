package com.etoc.mode.structural.adapter.type;

/**
 * ���ܣ�Adapter�ࣺ���220V-5V��ת��
 * ͨ���̳�src�࣬ʵ�� dst ��ӿڣ����src->dst�����䡣
 * ���ߣ�liuxiaolong
 */

public class VoltageAdapter extends Voltage220 implements Voltage5 {
    @Override
    public int output5V() {
        int src = output220V();
        System.out.println("������������ʼ�����ѹ");
        int dst = src / 44;
        System.out.println("������ɺ������ѹ��" + dst);
        return dst;
    }
}