package �������͸�ʽ����;

import java.text.DecimalFormat;

/**
 * 
 * @author ���
 *
 */
public class Test01 {
	
	/**
	 * 
	 * @param param1  -Ҫ��ʽ��������
	 * @param param2 -Ҫ��ʽ������ֵ
	 */
	public static void ��ʽ��������������(String param1,double param2) {
		DecimalFormat df =new DecimalFormat(param1);
		String format = df.format(param2);
		System.out.println("use "+param1+":"+param2+",is"+format);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test01.��ʽ��������������("0.00",1234);//ȱ�����ټ�0

	}

}
