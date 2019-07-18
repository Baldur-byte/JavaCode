package 大数值类型的计算;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * BigInteger  运算结果会超出Integer范围的数值使用
 * 只能做整数运算
 * @author 李东升
 *
 */
public class BigIntegerTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MAX_VALUE);
		BigInteger big1 =new BigInteger("2147483648");
		BigInteger big2 =new BigInteger("3453453");
		/*
		System.out.println(big1.add(big2));
		System.out.println(big1.subtract(big2));
		System.out.println(big1.multiply(big2));
		System.out.println(big1.divide(big2));
		System.out.println(big1.max(big2));//比较返回较大的值
		
		BigInteger[] result = big2.divideAndRemainder(big1);
		System.out.println("商："+result[0]+"余"+result[1]);
		*/
		
		//------------------------------
		BigDecimal big_1 =new BigDecimal(2147483648.11);
		BigDecimal big_2=new BigDecimal(2147483648.11);
		System.out.println(big_1.add(big_2));

	}
	
	@SuppressWarnings("deprecation")
	public static double round(double d,int len) {
		BigDecimal d1 =new BigDecimal(d);
		BigDecimal d2=new BigDecimal(1);
		
		return d1.divide(d2,len,BigDecimal.ROUND_HALF_UP).doubleValue();//四舍五入
		
	}

}
