package system;

import java.util.Date;

public class test01 {
	public static void main(String[] args) {
		
		long currentTimeMillis = System.currentTimeMillis();
		
		long time = new Date().getTime();
		
		System.out.println(currentTimeMillis);
		System.out.println(time);
		
		try {
			Thread.sleep(1000);
			
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
		
		long currentTimeMillis2 = System.currentTimeMillis();
		
		System.out.println(currentTimeMillis2);
		
	}

}
