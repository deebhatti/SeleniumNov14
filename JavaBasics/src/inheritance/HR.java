package inheritance;

public class HR extends Management{
	
	
	
	int annualBonus = 12000;

	
	public static void main(String[] args) {
		HR Sham = new HR();
		System.out.println("Total annual compensation of Sham = $ " + (Sham.annualBonus+ Sham.annualSalary));
	
		
		
	}

}
