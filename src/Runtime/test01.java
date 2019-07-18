package Runtime;

public class test01 {
	public static void main(String[] args) {
		Runtime runtime =Runtime.getRuntime();//获取java运行时对象
		
		//获取最大jvm内存
		System.out.println(runtime.maxMemory());
		
		//获取剩余jvm内存
		System.out.println(runtime.freeMemory());
		
		//垃圾回收
		runtime.gc();//java是自动回收垃圾，也可以手动回收
		
	}

}
