class SinoTibetan extends Language{
  SinoTibetan(String languageName, int speakers) {
     super(languageName, speakers, "Asia", "subject-object-verb");
  }

  @Override
  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionSpoken + ".");

    System.out.println("The language follows the word order: " + this.wordOrder);
  }
}
