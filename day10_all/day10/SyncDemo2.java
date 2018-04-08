package day10;
/**
 * ��Ч����Сͬ����Χ�����ڱ�֤������ȫ��ǰ����
 * ��������߲���Ч��
 * @author adminitartor
 *
 */
public class SyncDemo2 {
	public static void main(String[] args) {
		final Shop shop = new Shop();
		Thread t1 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		t1.start();
		t2.start();
		
	}
}


class Shop{
//	public synchronized void buy(){
	public void buy(){	
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName()+":������ѡ�·�...");
			Thread.sleep(5000);
			/*
			 * ͬ������Ը���ȷ��ָ����Ҫͬ���Ĵ���Ƭ�Ρ�
			 * 
			 * ��ϣ������߳�ͬ��ִ������Ĵ��룬����Ҫ��
			 * ͬ������ָ����"ͬ��������(��:�����Ķ���)"
			 * ������ͬһ���ſ��ԡ�
			 * 
			 * ��������t1,t2���õ���ͬһ��shop��buy������
			 * �������������߳̿�����this�������shop����
			 * ��ô���ͬ����;�����ͬ��Ч����
			 */
			synchronized (this) {					
				System.out.println(t.getName()+":�������·�...");
				Thread.sleep(5000);
			}
			System.out.println(t.getName()+":�����뿪");
			
			
		} catch (Exception e) {
		}
	}
}






