public class Calculator{
	private double result;
	
	public void add(double ... params){
		for(Double param: params){
			this.result+=param;
		}
	}
	
	public void minus(double ... params){
		
		for(Double param: params){
			this.result-=param;
		}
	}
	
	public void multiply(double ... params){
		
			this.result+=params[0]* params[1];
		
	}
	
	public void divide(double ... params){
		
			this.result+=params[0] / params[1];
		
	}
	
	public void stepen(double ... params){
		
			this.result+= Math.pow(params[0], params[1]);
		
	}
	
	public double getResult(){
		return this.result;
	}
	
	
	public void cleanResult(){
		this.result=0;
	}
	
}