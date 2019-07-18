package 定时器;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * TimerTask 是做定时器的类，继承该类，并重写run方法
 * 
 * Timer 是定时器类，每隔多长时间触发该定时任务
 * @author 李东升
 *
 */

public class 定时任务 extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format =sdf.format(new Date());//将日期转换为一个字符串		System.out.println(format);
		
	}

}
