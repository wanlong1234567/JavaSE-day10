package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ʹ�ü��Ϲ�����java.util.Collections�����
 * ��̬�������Խ����еļ��ϻ�Mapת��Ϊ�̰߳�ȫ��
 * @author adminitartor
 *
 */
public class SyncApiDemo {
	public static void main(String[] args) {
		/*
		 * ArrayList��LinkedList�������̰߳�ȫ��
		 */
		List<String> list
			= new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		
		list = Collections.synchronizedList(list);
		System.out.println(list);
		
		/*
		 * HashSet�����̰߳�ȫ�ġ�
		 */
		Set<String> set 
			= new HashSet<String>(list);
		System.out.println(set);
		set = Collections.synchronizedSet(set);
		System.out.println(set);
		
		/*
		 * HashMap�����̰߳�ȫ��
		 */
		Map<String,Integer> map 
			= new HashMap<String,Integer>();
		map.put("����", 98);
		map.put("��ѧ", 97);
		map.put("Ӣ��", 94);
		System.out.println(map);
		map = Collections.synchronizedMap(map);
		System.out.println(map);
			
		/*
		 * �������̰߳�ȫ�ļ���Ҳ�������������
		 * �ü��ϻ��⣬�����ڿ���ʱҪ����ά����
		 * ���ϵ��
		 */
	}
}




