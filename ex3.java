public class ex3 {
	public static void main(String[] args) {
		ex3 script = new ex3();
		script.launch();
	}
	
	
		public void launch() {
			System.out.println("Give me 10 numbers");
			
				double[] myArray = new double[10];
				int counter = 0;
				double sum = 0;
			while (counter < 10) {
				try {
						myArray[counter] = Double.parseDouble(System.console().readLine());
						counter++;
						
				}   catch (NumberFormatException ex) {
						ex.printStackTrace();
					}
			}	
				
				for (int i=0 ; i<10; i++) {
					
					sum = sum + myArray[i];
				}
				double result = sum/10;
				System.out.println("Your result is : " + result);
		}
			
}			
				
		