import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queues {

	public static void main(String[] args) {
		Queue<Double> queue=new ArrayBlockingQueue<Double>(4);
		queue.add(2.4);
		queue.add(2.7);
		queue.add(2.9);
		queue.add(2.0);
    for(Double adds : queue) {
    	System.out.println(adds);
    }
    queue.remove();
    System.out.println("after removing");
    
	  for(Double adds : queue) {
	    	System.out.println(adds);
	    }
	 System.out.println(queue.element());
	 queue.offer(17.5);
	 for(Double offered:queue) {
		 System.out.println(offered);
	 }
	System.out.println(queue.poll());
	queue.remove();
	System.out.println(queue.poll());
	queue.remove();
	System.out.println(queue.poll());
	}

}
