package 数据类型格式化类;

import java.text.DecimalFormat;

/**
 * 
 * @author 李东升
 *
 */
public class Test01 {
	
	/**
	 * 
	 * @param param1  -要格式化的类型
	 * @param param2 -要格式化的数值
	 */
	public static void 格式化各种数据类型(String param1,double param2) {
		DecimalFormat df =new DecimalFormat(param1);
		String format = df.format(param2);
		System.out.println("use "+param1+":"+param2+",is"+format);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test01.格式化各种数据类型("0.00",1234);//缺补，少加0

	}

}
