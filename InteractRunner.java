import java.util.Scanner;

public class InteractRunner{

public static void main(String [] agrs){
	Scanner reader = new Scanner(System.in);
	try{
		Calculator calc = new Calculator();
		String exit = "no";
		while (!exit.equals("yes")){
			System.out.println("Enter first arg");
			String first = reader.next();
			System.out.println("Enter second arg");
			String second = reader.next();
			System.out.println("enter operation: 1 - add, 2 - minus, 3 - multiply, 4 - divide, 5 - pow");
			
			String comand = reader.next();
			switch(comand){
				case "1":
				calc.add(Integer.valueOf(first), Integer.valueOf(second));
				break;
				
				case "2":
				calc.minus(Integer.valueOf(first), Integer.valueOf(second));
				break;
				
				case "3":
				calc.multiply(Integer.valueOf(first), Integer.valueOf(second));
				break;
				
				case "4":
				calc.divide(Integer.valueOf(first), Integer.valueOf(second));
				break;	

				case "5":
				calc.stepen(Integer.valueOf(first), Integer.valueOf(second));
				break;					
			}
			
			System.out.println("result = "+calc.getResult());
			System.out.println("clear result? yes/no");
			String clear = reader.next();
			if(clear.equals("yes")){
				calc.cleanResult();
			}
			
			
			System.out.println("Exit? yes/no");
			exit = reader.next();
		}
	}finally{
		reader.close();
	}
}
}