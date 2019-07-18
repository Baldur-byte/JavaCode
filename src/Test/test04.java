package Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test04 {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date.getTime());
		
		Calendar calendar=Calendar.getInstance();
		
		System.out.println(calendar.get(Calendar.YEAR));
		
		SimpleDateFormat sdf =new SimpleDateFormat("yy-MM-dd   HH-mm-ss");
		String format=sdf.format(new Date());//将日期转换为字符串
		System.out.println(format);
		
		try {
			Date 闹钟时间 = sdf.parse("2019-07-10 11-50-00");//将字符串转换为日期类型
			
			Calendar 当前日期 =Calendar.getInstance();
			
			while(当前日期.getTime().before(闹钟时间)) {
				
				
				当前日期=Calendar.getInstance();
				
			}
			
		}catch(java.text.ParseException e){
			e.printStackTrace();
			
		}
		
	}
	
}
