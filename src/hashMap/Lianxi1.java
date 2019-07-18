package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lianxi1 {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		map.put(2014, "公牛");
		map.put(2015,"湖人");
		map.put(2016,"勇士");
		map.put(2017,"火箭");
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入 一个年份：");
		
		int key =input.nextInt();
		
		if(map.containsKey(key)) {
			String string=map.get(key);
			System.out.println("冠军队伍是："+string);
			
		}else {
			
			System.out.println("你输入了一个错误的年份");
		}
		
	}
	
}
