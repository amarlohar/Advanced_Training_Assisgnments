import java.util.Scanner;

public class ListEvenNumbersByTakingUserInput 

{
	
	public static void main(String args[]) 
	
	{
		
		Scanner scanInput=new Scanner(System.in);

		System.out.println("Please Enter The Number : ");

		int n=scanInput.nextInt();

		System.out.print("List Of All Even Numbers Of "+n+" are: ");

		for (int i = 1; i <= n; i++) 
			
		{
		   
		   if (i % 2 == 0) {  //if number%2 == 0 it means its an even number

		 System.out.print(i + " ");

		   }
		   scanInput.close();
		}

	}
}
