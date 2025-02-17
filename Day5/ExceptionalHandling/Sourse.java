package Day5.ExceptionalHandling;

public class Sourse {
	public static void main(String[] args) {
       
        Activity activity = new Activity("Hello", "Welcome", "+");
        
        Sourse source = new Sourse();

        try {
            
            if (!source.validate(activity)) {
                throw new Operatorexception("Invalid parameters");
            }

            String result = source.doOperation(activity);
            System.out.println(result);

        } catch (Operatorexception e) {
            e.printStackTrace();  
        }
    }

    public boolean validate(Activity activity) {
       
        if (activity.getString1() == null || activity.getString2() == null || activity.getOperator() == null) {
            System.out.println("One or more input parameters are null.");
            return false;
        }

        if (!activity.getOperator().equals("+") && !activity.getOperator().equals("-")) {
            return false;  
        }

        return true;
    }

    public String doOperation(Activity activity) {
       
        if (activity.getOperator().equals("+")) {
            return activity.getString1() + activity.getString2();
        }

        else if (activity.getOperator().equals("-")) {
            String result = activity.getString1();
            for (int i = 0; i < activity.getString2().length(); i++) {
                result = result.replace(String.valueOf(activity.getString2().charAt(i)), "");
            }
            return result;
        }

        return "";
    }

}
