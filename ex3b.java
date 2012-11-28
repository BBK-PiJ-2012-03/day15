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
					
					
			}
			int size = Integer.parseInt(str);
			
			
			System.out.println("Give me " + size + " numbers");
			
				double[] myArray = new double[size];
				int counter = 0;
				double sum = 0;
			while (counter < size) {
				try {
						myArray[counter] = Double.parseDouble(System.console().readLine());
						counter++;
						
				}   catch (NumberFormatException ex) {
						ex.printStackTrace();
					}
			}	
				
				for (int i=0 ; i<size; i++) {
					
					sum = sum + myArray[i];
				}
				double result = sum/size;
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