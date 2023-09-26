public class DNA {
  // DNA Sequencing

  public static void main(String[] args) {

    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    String dna = dna1;
    int length = dna.length();
    int start = dna.indexOf("ATG");
    int stop = dna.indexOf("TGA");
    System.out.println("start: " + start);
    System.out.println("Stop: " + stop);
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ /
    //   / \   \   / \   \
    //  ~   `-~ `-`   `-~ `-

  }

}
