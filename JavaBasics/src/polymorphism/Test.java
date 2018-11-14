package polymorphism;

public class Test {
	
	public static void main(String[] args) {
		//Car BMW = new Car();
		Features bv = new BasicVariant();
		Features mv = new MiddleVariant();
		Features tv = new TopEndVariant();
		
		mv.airbags();
		mv.powerWindows();
		mv.sunroof();
		
		ExtraTax mvcu = new MiddleVariant();
		ExtraTax tvcu = new TopEndVariant();
		
		mvcu.extraRegistrationFees();
		
		
		
		
	}

}
