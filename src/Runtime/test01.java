package Runtime;

public class test01 {
	public static void main(String[] args) {
		Runtime runtime =Runtime.getRuntime();//��ȡjava����ʱ����
		
		//��ȡ���jvm�ڴ�
		System.out.println(runtime.maxMemory());
		
		//��ȡʣ��jvm�ڴ�
		System.out.println(runtime.freeMemory());
		
		//��������
		runtime.gc();//java���Զ�����������Ҳ�����ֶ�����
		
	}

}
