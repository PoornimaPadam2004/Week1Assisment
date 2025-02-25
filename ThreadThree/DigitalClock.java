package ThreadThree;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DigitalClock extends Thread{
	
	    public void run() {
	        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
	        while (true) {
	            System.out.println(formatter.format(new Date()));
	            try {
	                Thread.sleep(500); // Pause for 500 milliseconds
	            } catch (InterruptedException e) {
	                System.out.println("Clock interrupted!");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        DigitalClock clock = new DigitalClock();
	        clock.start();
	    }
}



