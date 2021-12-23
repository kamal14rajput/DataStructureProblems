package com.bridgelabz.queue;

public class QueueMain {

	public static void main(String[] args) {
		QueueService<Integer> queueService = new QueueService<Integer>();
		
		queueService.enqueue(56);
		queueService.enqueue(30);
		queueService.enqueue(70);
		
		queueService.display();
	}

}
