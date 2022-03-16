
public class AcceptsNumbersByCommandLine {

		  public static void main(String[] args) {

		    int n = 13, firstNumber = 1, secondNumber = 3;
		    System.out.println("Next " + n + " Numbers is :");

		    for (int i = 1; i <= n+2; ++i) {
		      System.out.print(firstNumber + " ");

		      // compute the next term
		      int nextTerm = firstNumber + secondNumber;
		      firstNumber = secondNumber;
		      secondNumber = nextTerm;
		    }
		  }
		}


