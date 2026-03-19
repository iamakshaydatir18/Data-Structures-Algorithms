package queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Queue q=new Queue(5);
		 * 
		 * q.dequeue();
		 * 
		 * q.enqueue(6); q.enqueue(5); q.front(); q.rear(); q.Dislay();
		 * 
		 * q.dequeue(); q.front(); q.rear(); q.dequeue(); q.dequeue();
		 * 
		 * q.front(); q.rear();
		 * 
		 * q.Dislay();
		 */

		/*
		 * QueueLinkList q= new QueueLinkList(); q.enqueue(6); q.enqueue(2);
		 * q.enqueue(2);
		 * 
		 * q.Print();
		 * 
		 * q.dequeue(); q.dequeue();
		 * 
		 * q.Print();
		 * 
		 * q.dequeue(); q.dequeue();
		 */

		/*
		 * DoublyLinkList q = new DoublyLinkList();
		 * 
		 * q.insertFront(6); q.insertFront(5); q.insertFront(1);
		 * 
		 * q.Display(); System.out.println("inserting from rear- "); q.insertRear(8);
		 * q.insertRear(0); q.Display();
		 * 
		 * q.deleteFront(); q.Display();
		 * 
		 * q.deleteRear(); q.Display();
		 */

		/*
		 * Deque<Integer> deque = new ArrayDeque<>(); deque.addFirst(6);
		 * deque.addLast(7); deque.addFirst(5); deque.addLast(1);
		 * 
		 * deque.offerFirst(10); deque.offerLast(12);
		 * 
		 * deque.removeFirst(); // deque.removeLast();
		 */
		/*
		 * Queue<Integer> q = new LinkedList<>();
		 * 
		 * q.add(4); q.add(7);
		 * 
		 * System.out.println("peek "+q.peek());
		 * 
		 * q.poll(); System.out.println("Queue is - "); for (int a : q) {
		 * System.out.println(" " + a); }
		 */
		
		/*
		 * Map<Character, Integer> map = new HashMap<>();
		 * 
		 * map.put('l', 1);
		 * 
		 * System.out.println(" "+ map.containsKey('e'));
		 * 
		 * System.out.println(" Map & Key - "+map.get('l')); for(int i=0;i<10;i++) {
		 * 
		 * if(map.get('l') == 'l') { int key = map.get('l'); map.put('l',key++); } }
		 * 
		 * for(Map.Entry a:map.entrySet()) {
		 * 
		 * System.out.println("Key "+a.getKey()+ " Value  "+a.getValue()); }
		 * 
		 * System.out.println(" value - "+map.getOrDefault(map, 1));
		 */
		
		DoublyLinkList d = new DoublyLinkList();
		
		d.insertFront(1);
		d.insertRear(2);
		d.insertMiddle(3);
		d.insertMiddle(4);
		d.deleteFront();
		d.deleteMiddle();
		d.deleteMiddle();
		
		d.Display();
		
		
		
		
	}

}
