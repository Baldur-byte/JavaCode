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
		String format=sdf.format(new Date());//������ת��Ϊ�ַ���
		System.out.println(format);
		
		try {
			Date ����ʱ�� = sdf.parse("2019-07-10 11-50-00");//���ַ���ת��Ϊ��������
			
			Calendar ��ǰ���� =Calendar.getInstance();
			
			while(��ǰ����.getTime().before(����ʱ��)) {
				
				
				��ǰ����=Calendar.getInstance();
				
			}
			
		}catch(java.text.ParseException e){
			e.printStackTrace();
			
		}
		
	}
	
}
