package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lianxi1 {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		map.put(2014, "��ţ");
		map.put(2015,"����");
		map.put(2016,"��ʿ");
		map.put(2017,"���");
		
		Scanner input=new Scanner(System.in);
		System.out.println("������ һ����ݣ�");
		
		int key =input.nextInt();
		
		if(map.containsKey(key)) {
			String string=map.get(key);
			System.out.println("�ھ������ǣ�"+string);
			
		}else {
			
			System.out.println("��������һ����������");
		}
		
	}
	
}
