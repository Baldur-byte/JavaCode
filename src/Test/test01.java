package Test;

public class test01 {
	public static void main(String[] args) {
		
		String s ="           abc       ";
		
		s.trim();//ȥ���ҿո񣬵�s������Ϊ"        abc       "
		s=s.trim();//�ַ�����Ҫ�ı䣬��Ҫ�����Ӹ�ֵ����
		
		"".equalsIgnoreCase("");//���Դ�Сд�ıȽ�
		
		s.toUpperCase();//ת����д
		
		s.toLowerCase();//ת��Сд
		
		s.concat("");//��������concat,������ı�s������Ҫ�ٸ�ֵ
		
		s.charAt(0);//��������λ���ַ�
		s.lastIndexOf("");//�������һ�γ��ֵ�����λ��
		
		s.substring(1, 3);//[1,3)
		
		String[] split = s.split(",");//��������������ת���ַ�ת��  \\
		
		String valueOf=String.valueOf(1);//�ַ����ṩ��һ��valueOf����������ͬ��������ת��Ϊ�ַ���
		
	}

}
