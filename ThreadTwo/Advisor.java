package ThreadTwo;
import java.util.Random;
public class Advisor {

	    public static void main(String[] args) {
	        String[] advices = {
	            "Never begin to stop and never stop to begin.",
	            "Only destination isn’t important, one should enjoy the journey.",
	            "Impossible itself says ‘I’m possible’.",
	            "Success is not final, failure is not fatal: it is the courage to continue that counts.",
	            "Your attitude, not your aptitude, will determine your altitude."
	        };

	        Random random = new Random();
	        int index = random.nextInt(advices.length);
	        System.out.println("Advice of the day: " + advices[index]);
	    }
	


}
