public class Calculator {
  public Calculator(){
    //
    /*
    This is an Abacus that is used to slide beads around and do math.
    It was created by Laura in 2019.
    */
  }

  public int add(int a, int b){
    return a+b;
    // ADDITION
  };

  public int subtract(int a, int b){
    return a-b;
    // SUBTRACTION
  };

  public int multiply(int a, int b){
    return a*b;
    // MULTIPLICATION
  };

  public int divide(int a, int b){
    return a/b;
    // DIVISION
  };

  public int modulo(int a, int b){
    return a%b;
    //MODULO
  };

  public static void main(String[] args){
    // using addition
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5, 7));

    System.out.println(myCalculator.subtract(45, 11));
  }
}
