package Test;

import java.util.ArrayList;
import java.util.List;

public class test03 {
	
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE+1);
		System.out.println(Integer.MAX_VALUE+2);
		
		Character.isDigit(1);//�ж��Ƿ�������
		Character.isLetter('c');//�ж��Ƿ�����ĸ
		
		List<Object> list= new ArrayList<Object>();
		//��װ����Զ�װ�䣬��������������ת��Ϊ��Ӧ�İ�װ���ͣ��ٷ��뼯��
		list.add(1);
		list.add(true);
		list.add(3.14);
		list.add("abc");
		
		Integer integer =new Integer(12);
		Boolean boolean1=new Boolean(true);
		
		//��װ����Զ����䣬����*****Value()���������������װ���ɻ�����������
		int x = integer.intValue();
		boolean booleanValuee =boolean1.booleanValue();
		
		//������������ת��װ���ͣ�ͨ����װ��Ĺ�����ʵ��
		int y=101;
		Integer integerY=new Integer(y);
		
		//�ַ���------->������������          parse****()
		int parseInt=Integer.parseInt("12");
		
	}

}
