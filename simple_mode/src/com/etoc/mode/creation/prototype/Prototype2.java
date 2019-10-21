package com.etoc.mode.creation.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * --ԭ�����(���л�,�����л�)
 * @author Administrator
 *
 */
public class Prototype2 {
	static class Student implements Serializable {// ����Ϊ�˼򵥣�ֱ��public��ʵ���в��Ƽ�
		private static final long serialVersionUID = 6977402643848374753L;
		// ��Ϊʵ��Ӧ�������ǻ�Ķ��ģ�UID�����ж���汾��Ĭ��Ϊ1L;
		public int id = 12345;
		public String name = "С��";
		public Address address = new Address();

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
		}
	}

	static class Address implements Serializable {
		@Override
		public String toString() {
			return "Address [name=" + name + "]";
		}

		public String name = "����";
	}

	public static <T extends Serializable> T clone(T obj) throws Exception {
		T cloneObj;
		// д���ֽ���
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ObjectOutputStream obs = new ObjectOutputStream(out);
		obs.writeObject(obj);
		obs.close();
		// �����ڴ棬д��ԭʼ���������¶���
		ByteArrayInputStream ios = new ByteArrayInputStream(out.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(ios);
		// �������ɵ��¶���
		cloneObj = (T) ois.readObject();
		ois.close();
		return cloneObj;
	}

	public static void main(String[] args) throws Exception {
		Student student = new Student();
		Student clone = clone(student);
		System.out.println(clone);
	}
}
