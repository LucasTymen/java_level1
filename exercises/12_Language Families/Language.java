class Language {

  protected String name;
  protected int numSpeakers;
  protected String regionSpoken;
  protected String wordOrder;

  Language(name, numSpeakers, regionSpoken, wordOrder) {
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionSpoken = regions;
    this.wordOrder = wdOrder;
  }

  public void getInfo() {
    System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken+ ". The language follows the word order: " + wordOrder);
  }

  public static void main(String[] args) {

  }
}
