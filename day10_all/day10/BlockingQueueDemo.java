package day10;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingQueueDemo {
	public static void main(String[] args) {
		BlockingDeque<String> queue 
			= new LinkedBlockingDeque<String>();
		
		queue.offer("");
		
		queue.poll();
	}
}
