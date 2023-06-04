package weekFive;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger asterikLogger = new AsterikLogger();
		asterikLogger.log("Dragon");
		System.out.println();
		asterikLogger.error("Fox");
		
		System.out.println("\n");
				
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.log("Lion");
		System.out.println();
		spacedLogger.error("Rabbit");
		
	} // end of class


} //end of main method
