import java.util.Scanner;

/**
 * 
 */

/**
 * @author h.meadows
 * Mr.Hardman
 * Lab5,Program3
 *11/29/2016
 */
public class greatestvalue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] userArray = new int [5];
		int indexOfSearched = -1;
		double userValue;
		int minimum;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter 5 values: ");
		
		for(int i = 0; i < userArray.length; i++){
			System.out.print("Please enter a value: ");
			userArray[i] = userInput.nextInt();
		}
		
		minimum = userArray[0];
		
		for(int i = 0; i < userArray.length; i++){
			if(userArray[i] > minimum){
				minimum = userArray[i];
				
				if(minimum == userArray[i]){
					indexOfSearched = i;
				}
			}
		}
		
		System.out.println("\nThe largest value is: " + minimum);
		System.out.println("The index of the largest value is: " + indexOfSearched);
		
		userInput.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
