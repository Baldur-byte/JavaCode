package ������ʽ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pattern   ��   Matcher    һ�𹹳�������ʽ
 * 
 * Pattern   compile()  ��matcher()����
 * 
 * Matcher    matches()
 * @author ���
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
			System.out.println("ƥ��");
		}

	}

}
