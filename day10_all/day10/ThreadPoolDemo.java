package day10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳�
 * �̳߳���Ҫ�����������:
 * 1:�����߳�����
 *   ÿ���̶߳���Ҫռ��һ�����ڴ棬�߳�����Խ��ռ��
 *   �ڴ���ԴԽ�࣬�����̶߳����Ժ�CPU��ѯʱ���
 *   �߳��γ�CPU�����л�����Щ���ᵼ��ϵͳ��������
 *   ��̱��
 * 2:�����߳�
 *   Ƶ�����������߳�Ҳ����̵߳��ȴ�������������
 *   �����̣߳���Сϵͳ������
 *   
 * @author adminitartor
 *
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService threadPool
			= Executors.newFixedThreadPool(2);
		
		for(int i=0;i<5;i++){
			Runnable r = new Runnable(){
				public void run(){
					try {
						Thread t = Thread.currentThread();
						System.out.println(
							t.getName()+":����ִ������...");
						/*
						 * ��һ�������������̱߳��ж�ʱ����
						 * �׳��ж��쳣InterruptedException
						 */
						Thread.sleep(5000);
						System.out.println(
							t.getName()+":�����������!");
					} catch (InterruptedException e) {
						System.out.println("�̱߳��ж��ˣ�");
					}
				}
			};
			threadPool.execute(r);
			System.out.println("��һ������ָ�ɸ��̳߳�");
		}
		
		/*
		 * shutdown()��shutdownNow()
		 * ǰ�ߵ�����Ϻ��̳߳ز��ٽ����µ�����
		 * ���һὫ����ʣ������ִ����Ϻ�����ͣ
		 * ֹ��
		 * ���ߵ��ú��̳߳ػ�ǿ���жϳ���������
		 * �̲�����ֹͣ�̳߳ء�
		 */
		threadPool.shutdownNow();
		System.out.println("�̳߳���ֹͣ!");
	}
}













