public class Calculate{
	public static void main(String [] args){
		System.out.println("Calculate...");
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int sum = first+second;
		System.out.println("sum " + sum);
		
		int minus = first - second;
		System.out.println(minus);
		
		double div = (double)first/second;
		System.out.println(div);
		
		double mult = first*second;
		System.out.println(mult);
		
		double pow = Math.pow(first, second);
		System.out.println(pow);
	}
}