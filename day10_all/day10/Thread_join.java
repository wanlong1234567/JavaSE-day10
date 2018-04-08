package day10;
/**
 * �߳��ṩ��һ������:
 * void join()
 * �÷�������һ���߳�����һ���߳��ϵȴ���ֱ����
 * ��ɹ�����Ž�������������С�
 * ����join����Э���߳�֮��ͬ�����С�
 * 
 * ͬ�����첽
 * ͬ������ָ�������������Ⱥ�˳���ִ�С�
 * �첽����ָ������������"���ɸ���"������Ӱ�졣
 * 
 * ���̲߳������첽���д���ġ�����ʱ������Ҫ��Щ
 * �̼߳�Ĵ���ͬ������ʱ����ʹ��join����̼߳�
 * ͬ����
 * @author adminitartor
 *
 */
public class Thread_join {
	//��ʾͼƬ�Ƿ��������
	public static boolean isFinish;
	
	public static void main(String[] args) {		
		/*
		 * ��һ�������ľֲ��ڲ��������������������
		 * �����ֲ���������ô�þֲ�����������final��
		 * ��������JVM�ڴ�������⣬JAVA8�Ժ�û�д�
		 * ���⡣
		 */
		final Thread download = new Thread(){
			public void run(){
				System.out.println("down:��ʼ����ͼƬ...");
				for(int i=1;i<=100;i++){
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}					
				}
				System.out.println("down:ͼƬ�������!");
				isFinish = true;
			}
		};
		
		Thread show = new Thread(){
			public void run(){
				System.out.println("show:��ʼ��ʾͼƬ");
				//�ȴ������߳̽�ͼƬ�������
				try {
					/*
					 * ��show�̵߳���download.join()����
					 * ������ͽ���������״̬��ֱ��download
					 * ִ����ϲŻ��������������к������롣
					 */
					download.join();
				} catch (InterruptedException e) {
				}
				
				if(!isFinish){
					throw new RuntimeException("ͼƬû���������!");
				}
				System.out.println("show:ͼƬ��ʾ���");
			}
		};
		
		
		download.start();
		show.start();
	}
}










