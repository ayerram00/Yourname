/**
 *   File Name: YourName.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 21, 2016
 *   
 */

/**
 * YourName //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      LastName, FirstName
 * @version     1.0.0
 * @since       1.0
 *
 */

import java.util.Scanner;

public class YourName
{
	
	static Scanner scanner = new Scanner (System.in);	
	public static void main(String[] args)
	{
	
		System.out.print("what is your name");
		//String name;
		String name=scanner.nextLine();
		System.out.println(name + " Welcome");
		
	}
	

}
