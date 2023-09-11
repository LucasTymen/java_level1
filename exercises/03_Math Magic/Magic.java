public class Magic {
	public static void main(String[] args) {
    // myNumber is the original number
    int myNumber = 77;
    int stepOne = myNumber*myNumber;
    int stepTwo = stepOne+myNumber;
    int stepThree = stepTwo/myNumber;
    int stepFour = stepThree+17;
    int stepFive = stepFour-myNumber;
    int stepSix = stepFive/6;

    //testing routine
    System.out.println(stepSix);
	}
}
