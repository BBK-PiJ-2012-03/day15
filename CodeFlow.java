import java.util.*;
public class CodeFlow {
	public static void main(String[] args) {
		CodeFlow script = new CodeFlow();
		script.launch(6);
	}
	
	
		public void launch(int userInput) {
			List<Integer> intList = new ArrayList<Integer>();
			intList.add(1);
			intList.add(2);
			intList.add(3);
			intList.add(4);
			intList.add(5);
			intList.add(6);
			try {
				intList.remove(0);
				System.out.println(intList.get(userInput));
				intList.remove(0);
				System.out.println(intList.get(userInput));
				intList.remove(0);
				System.out.println(intList.get(userInput));
				intList.remove(0);
				System.out.println(intList.get(userInput));
				intList.remove(0);
				System.out.println(intList.get(userInput));
				intList.remove(0);
				System.out.println(intList.get(userInput));
				intList.remove(0);
				System.out.println(intList.get(userInput));
			} catch (IndexOutOfBoundsException ex) {
					ex.printStackTrace();
				}
		}
		/** For Input : 0: line 29
				2: line 25
				4: line 21
				6: line 19
Exercise 2 : You cant write expection, u have to specify the type				*/
				
}		

