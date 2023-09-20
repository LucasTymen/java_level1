public class CarLoan {

	public static void main(String[] args) {
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayement = 2000;

    if(loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    }

    if(downPayement >= carLoan) {
      System.out.println("The car can be paid in full.");
    } else {
      System.out.println("financial adjustement");

    }
	}
}
