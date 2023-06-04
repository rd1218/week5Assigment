package weekFive;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		
		System.out.print("***");
		for (int i=0; i < log.length();i++) {	
			System.out.print(log.charAt(i) + " ");	
		}
		System.out.print("***");
		
	}

	@Override
	public void error(String error) {
		
		System.out.print("Error:" + " ");
		for (int i=0; i < error.length();i++) {
			System.out.print(error.charAt(i)+" ");
			
		}
	}

}
