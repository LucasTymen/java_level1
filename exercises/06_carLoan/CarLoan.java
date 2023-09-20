public class CarLoan {
  /*
  This program calculate a monthly payement for a car loan. enjoy !
  */
    public static void main(String[] args) {
      int carLoan = 10000;
      int loanLength = 3;
      int interestRate = 5;
      int downPayement = 2000;

      if(loanLength <= 0 || interestRate <= 0) {
        System.out.println("Error! You must take out a valid car loan.");
      }
      else if(downPayement >= carLoan) {
        System.out.println("The car can be paid in full.");
      } else {
        System.out.print("financial adjustement ->  ");
        int remainingBalance = carLoan - downPayement;
        int months = loanLength * 12;
        int monthlyBalance = remainingBalance / months;
        int interest = (monthlyBalance * interestRate) / 100;
        int monthlyPayment = monthlyBalance + interest;
        System.out.print(monthlyPayment);
      }
    }
  }
