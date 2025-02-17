package Collections.question5;

import java.util.LinkedList;
public class Queue<T> {
	    private LinkedList<T> queue;

	    public Queue() {
	        queue = new LinkedList<>();
	    }

	    public void enqueue(T element) {
	        queue.addLast(element); 
	    }

	    public T dequeue() {
	        if (!isEmpty()) {
	            return queue.removeFirst(); 
	        } else {
	            System.out.println("Queue is empty!");
	            return null;
	        }
	    }

	    public boolean isEmpty() {
	        return queue.isEmpty();
	    }

	    public int size() {
	        return queue.size();
	    }

	    public T peek() {
	        if (!isEmpty()) {
	            return queue.getFirst();
	        } else {
	            System.out.println("Queue is empty!");
	            return null;
	        }
	    }

	    public void display() {
	        if (!isEmpty()) {
	            System.out.println("Queue elements: " + queue);
	        } else {
	            System.out.println("Queue is empty!");
	        }
	    }
	}

