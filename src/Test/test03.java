package Test;

import java.util.ArrayList;
import java.util.List;

public class test03 {
	
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE+1);
		System.out.println(Integer.MAX_VALUE+2);
		
		Character.isDigit(1);//判断是否是数字
		Character.isLetter('c');//判断是否是字母
		
		List<Object> list= new ArrayList<Object>();
		//包装类的自动装箱，将基本数据类型转换为对应的包装类型，再放入集合
		list.add(1);
		list.add(true);
		list.add(3.14);
		list.add("abc");
		
		Integer integer =new Integer(12);
		Boolean boolean1=new Boolean(true);
		
		//包装类的自动拆箱，调用*****Value()方法，将类的类型装换成基本数据类型
		int x = integer.intValue();
		boolean booleanValuee =boolean1.booleanValue();
		
		//基本数据类型转包装类型，通过包装类的构造器实现
		int y=101;
		Integer integerY=new Integer(y);
		
		//字符串------->基本数据类型          parse****()
		int parseInt=Integer.parseInt("12");
		
	}

}
