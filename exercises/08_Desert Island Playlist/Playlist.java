import java.util.ArrayList;

class Playlist {

  public static void main(String[] args) {
    // declaration of the ArrayList
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    // 5 songs
    desertIslandPlaylist.add("Stairway to heaven");
    desertIslandPlaylist.add("Highway Star");
    desertIslandPlaylist.add("The Emerald");
    desertIslandPlaylist.add("Holy Wars");
    desertIslandPlaylist.add("Possessed to Skate");
    desertIslandPlaylist.add("Coco caline");
    desertIslandPlaylist.add("Barbie");

    // step 4
    System.out.println(desertIslandPlaylist);

    //printing the size of the list
    System.out.println(desertIslandPlaylist.size());

    // deleting songs
    desertIslandPlaylist.remove("Coco caline");
    desertIslandPlaylist.remove(5);
    System.out.println(desertIslandPlaylist.size());
    System.out.println(desertIslandPlaylist);
  }

}
