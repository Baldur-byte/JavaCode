package Test;

public class test02 {
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer("");
		
		for (int i=0; i<10; i++) {
			sb.append(i);
			
		}
		
		for(int i=sb.length()-3;i>0; i=i-3) {
			sb.insert(i, ",,");//在指定索引插入
			
		}
		
		String newStr =sb.toString();//StringBuffer转换成string 操作
		
		System.out.println(sb.toString());
		
	}

}
