package Test;

public class test01 {
	public static void main(String[] args) {
		
		String s ="           abc       ";
		
		s.trim();//去左右空格，但s内容仍为"        abc       "
		s=s.trim();//字符串需要改变，需要左侧添加赋值操作
		
		"".equalsIgnoreCase("");//忽略大小写的比较
		
		s.toUpperCase();//转换大写
		
		s.toLowerCase();//转换小写
		
		s.concat("");//单纯调用concat,并不会改变s，还需要再赋值
		
		s.charAt(0);//返回索引位置字符
		s.lastIndexOf("");//返回最后一次出现的索引位置
		
		s.substring(1, 3);//[1,3)
		
		String[] split = s.split(",");//如果有特殊符号用转义字符转义  \\
		
		String valueOf=String.valueOf(1);//字符串提供了一个valueOf方法，将不同数据类型转换为字符串
		
	}

}
