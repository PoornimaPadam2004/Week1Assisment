package day2oops.question3;

public class Product {
	private int productno;
    private String productname;
    private float price;
    private int quantity;

    public void initializeProduct(int productno, String productname, float price, int quantity) {
        this.productno = productno;
        this.productname = productname;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProductDetails() {
        float totalAmount = price * quantity;
        System.out.println("Product No   Product Name   Quantity   Price   Total Amount");
        System.out.println("---------------------------------------------------------");
        System.out.println(productno + "          " + productname + "        " + quantity + "       " + price + "     " + totalAmount);
    }

    public static void main(String[] args) {
       
        Product product = new Product();

        product.initializeProduct(101, "Laptop", 50000.0f, 3);
        product.displayProductDetails();
    }

}
