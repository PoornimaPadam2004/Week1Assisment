package Collections.question5;

public class Main {
	  public static void main(String[] args) {
	      
	        Queue<Integer> integerQueue = new Queue<>();
	        integerQueue.enqueue(10);
	        integerQueue.enqueue(20);
	        integerQueue.enqueue(30);
	        integerQueue.display(); 
	        
	        System.out.println("Dequeue: " + integerQueue.dequeue()); 
	        integerQueue.display(); 
	        
	        Queue<Float> floatQueue = new Queue<>();
	        floatQueue.enqueue(10.5f);
	        floatQueue.enqueue(20.3f);
	        floatQueue.enqueue(30.7f);
	        floatQueue.display(); 
	        
	        System.out.println("Dequeue: " + floatQueue.dequeue()); 
	        floatQueue.display(); 
	        
	        Queue<Double> doubleQueue = new Queue<>();
	        doubleQueue.enqueue(100.5);
	        doubleQueue.enqueue(200.3);
	        doubleQueue.enqueue(300.9);
	        doubleQueue.display(); 
	        
	        System.out.println("Dequeue: " + doubleQueue.dequeue()); 
	        doubleQueue.display();
	        Queue<String> stringQueue = new Queue<>();
	        stringQueue.enqueue("Apple");
	        stringQueue.enqueue("Banana");
	        stringQueue.enqueue("Cherry");
	        stringQueue.display(); 
	        
	        System.out.println("Dequeue: " + stringQueue.dequeue()); 
	        stringQueue.display(); 
	    }
	}



