package ��ʱ��;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * TimerTask ������ʱ�����࣬�̳и��࣬����дrun����
 * 
 * Timer �Ƕ�ʱ���࣬ÿ���೤ʱ�䴥���ö�ʱ����
 * @author ���
 *
 */

public class ��ʱ���� extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format =sdf.format(new Date());//������ת��Ϊһ���ַ���		System.out.println(format);
		
	}

}
