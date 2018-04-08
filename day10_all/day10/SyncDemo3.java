package day10;
/**
 * ��̬����ʹ��synchorinzed���κ󣬸÷���һ������
 * ͬ��Ч����
 * 
 * ��̬������ʹ��synchronized���κ�ͬ��������
 * �����ǵ�ǰ��������
 * JVM�ڼ���ÿ�����ʱ�򣬶���ʵ����һ����ֻʵ����
 * һ��Class��ʵ��������������ࡣ����̬��������
 * �����������
 * 
 * @author adminitartor
 *
 */
public class SyncDemo3 {
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run(){
				Foo.dosome();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				Foo.dosome();
			}
		};
		t1.start();
		t2.start();
	}
}

class Foo{
	public synchronized static void dosome(){
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":��������dosome����...");
			Thread.sleep(5000);
			System.out.println(t.getName()+":����dosome�������!");
		} catch (Exception e) {
			
		}
	}
}







