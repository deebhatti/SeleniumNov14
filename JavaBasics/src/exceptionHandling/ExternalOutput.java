package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExternalOutput {
	
	public static void main(String[] args) throws FileNotFoundException  {
		File file = new File("D:\\EclipseWorkspace\\s25\\Output.txt");
		
		PrintWriter output = new PrintWriter(file);
		output.print("Deepinder Singh");
		output.println(" Bhatti");
		
		output.close();
		
		String day = "Friday";
		
		if(day.equals("Friday")) {
			throw new NullPointerException();
		}
		
		
	}

}
