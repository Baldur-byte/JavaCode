package Test;

public class test02 {
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer("");
		
		for (int i=0; i<10; i++) {
			sb.append(i);
			
		}
		
		for(int i=sb.length()-3;i>0; i=i-3) {
			sb.insert(i, ",,");//��ָ����������
			
		}
		
		String newStr =sb.toString();//StringBufferת����string ����
		
		System.out.println(sb.toString());
		
	}

}
