package day2oops.question10;

public class calc implements calculator{
	public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }

}
