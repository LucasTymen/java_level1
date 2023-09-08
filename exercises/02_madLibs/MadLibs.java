public class MadLibs {
  /*
  this program generate a mad libs.
  made by me
  */
  	public static void main(String[] args){
      String name1 ="Bobby Hewing";
      String name2 ="Gérard Larcher";
      String adjective1 ="charming";
      String adjective2 ="Fatty and bouncy";
      String adjective3 ="squishy";
      String noun1 ="pimp";
      String noun2 ="twink";
      String noun3 ="drag queens";
      String noun4 ="policemen";
      String noun5 ="judges";
      String noun6 ="good fairy mother";
      String place1 ="the senat";
      int number = 6;
      String verb1 ="Fucking";


      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.print(story);
    }
}
