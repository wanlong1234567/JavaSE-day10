package day10;
/**
 * ������
 * synchronized���β�ͬ�Ĵ���Ƭ�Σ���ͬ��������
 * ��������ͬ��ʱ����Щ����Ƭ��֮����ǻ���ġ�
 * ����̲߳���ͬʱ������Щ����Ƭ����һ��ִ�С�
 * @author adminitartor
 *
 */
public class SyncDemo4 {
	public static void main(String[] args) {
		final Boo b = new Boo();
		Thread t1 = new Thread(){
			public void run(){
				b.methodA();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				b.methodB();
			}
		};
		t1.start();
		t2.start();
	}
}

class Boo{
	public synchronized void methodA(){
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":��������A����");
			Thread.sleep(5000);
			System.out.println(t.getName()+":����A�������");
		} catch (Exception e) {
		}
	}
	public synchronized void methodB(){
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":��������B����");
			Thread.sleep(5000);
			System.out.println(t.getName()+":����B�������");
		} catch (Exception e) {
		}
	}
}









