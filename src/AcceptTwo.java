
public class AcceptTwo {
	
		  public static void main(String[] args) {

		    int i = 1, n = 13, firstTerm = 1, secondTerm = 3;
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    while (i <= n) {
		      System.out.print(firstTerm + ", ");

		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;

		      i++;
		    }
		  }
		}


