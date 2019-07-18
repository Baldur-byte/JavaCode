package 正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pattern   与   Matcher    一起构成正则表达式
 * 
 * Pattern   compile()  和matcher()方法
 * 
 * Matcher    matches()
 * @author 李东升
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String email ="";
		
		String pattern_email="";
		
		Pattern p =Pattern.compile(pattern_email);
		
		Matcher m = p.matcher(email);
		
		if(m.matches()) {
			System.out.println("匹配");
		}

	}

}
