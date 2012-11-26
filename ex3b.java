public class ex3b {
public static void main(String[] args) {
		ex3b script = new ex3b();
		script.launch();
	}
	
	
		public void launch() {
			
			System.out.println("How many numbers will you enter?");
			String str = System.console().readLine();
			
			while (!verifyNumber(str)) {
					str = System.console().readLine();
					System.out.println("TEST");
					
			}
			int size = Integer.parseInt(str);
			System.out.println(size);
			
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
		
		public boolean verifyNumber(String str) {
			try {
				int size = Integer.parseInt(str);
				return true;
			}
			catch (NumberFormatException ex) {
						ex.printStackTrace();
					}
			return false;
		}	
			
}		