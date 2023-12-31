public class DNA {
  // DNA Sequencing

  public static void main(String[] args) {

    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    String dna = dna3;
    int length = dna.length();

    int start = dna.indexOf("ATG");
    int stop = dna.indexOf("TGA");

    System.out.println("start: " + start);
    System.out.println("Stop: " + stop);

    if (start != -1 && stop != -1){
      System.out.println("Condition 1 and 2 are satisfied.");
    }

    if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
    System.out.println("Condition 1 and 2 and 3 are satisfied.");

    String protein = dna.substring(start, stop+3);
    System.out.println("Protein: " + protein);
    } else {
      System.out.println("No protein !");
    }
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ /
    //   / \   \   / \   \
    //  ~   `-~ `-`   `-~ `-

  }

}
