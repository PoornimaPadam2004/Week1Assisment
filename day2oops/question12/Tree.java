package day2oops.question12;

public class Tree {
	
	 private static int instanceCount = 0;

	    private int height;

	    public Tree() {
	        this.height = 0;  
	        instanceCount++;  
	        System.out.println("Planting a tree");
	    }

	    public Tree(int height) {
	        this.height = height;
	        instanceCount++;  
	        System.out.println("Planting a tree");
	    }

	    public void displayHeight() {
	        System.out.println("The height of the tree is: " + height + " meters");
	    }

	    public static void displayInstanceCount() {
	        System.out.println("Number of instances created: " + instanceCount);
	    }

	    public static void main(String[] args) {
	     
	        Tree tree1 = new Tree(); 
	        tree1.displayHeight();  

	        Tree tree2 = new Tree(5); 
	        tree2.displayHeight();  

	        Tree tree3 = new Tree();  
	        tree3.displayHeight();  

	        Tree.displayInstanceCount();  
	    }

}
