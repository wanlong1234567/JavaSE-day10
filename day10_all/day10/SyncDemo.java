package day10;
/**
 * ���̲߳�����ȫ����
 * �����߳�֮���������첽�ģ�����û��ǣ�ƣ������
 * ͬʱ����ͬһ��Դʱ�ͳ����ˡ����������������߳�
 * �����л������ʵ�ʲ�ȷ�����´���ִ��˳�����δ
 * ������Ƶ�˳��ִ�У�����һϵ�еĲ���Ԥ֪�����
 * 
 *  
 * @author adminitartor
 *
 */
public class SyncDemo{
	public static void main(String[] args) {
		final Table table = new Table();
		Thread t1 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();//ģ���̷߳������л�
					System.out.println(
						getName()+":"+bean);
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();//ģ���̷߳������л�
					System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	}
}

class Table{
	private int beans = 20;
	/**
	 * ��һ��������synchronized���κ󣬸÷�����Ϊ
	 * ͬ����������:����̲߳���ͬʱ���뵽�����ڲ�
	 * ȥִ�д��롣�����Ͳ���ͬʱ��beans�������
	 * ���в�����û���������⣬�Ͳ�����ֲ�����ȫ
	 * �����ˡ�
	 * 
	 * ��һ��������ʹ��synchronized���Σ���ô
	 * ͬ��������������Ǹ÷����������󣬼�����
	 * �ڲ�������this
	 * @return
	 */
	public synchronized int getBean(){
		if(beans==0){
			throw new RuntimeException("û�ж�����!");
		}
		Thread.yield();//ģ���̷߳������л�
		return beans--;
	}
}








