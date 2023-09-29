class Language {

  protected String name;
  protected int numSpeakers;
  protected String regionSpoken;
  protected String wordOrder;

  Language(String langName, int speakers, String regions, String wdOrder) {
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionSpoken = regions;
    this.wordOrder = wdOrder;
  }

  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);
  }

  public static void main(String[] args) {
    // spanish object
    Language spanish = new Language("Spanish", 555000000,"Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
    spanish.getInfo();

    // mayan object1
    Mayan kiche = new Mayan("Ki'che'", 2330000);
    kiche.getInfo();

    // mayan object2
    Mayan chontal = new Mayan("Chontal", 60563);
    chontal.getInfo();

    // chinese object
    SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
    mandarin.getInfo();

    // Burmese object
    SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
    burmese.getInfo();
  }
}
