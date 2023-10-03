
// Declaring without initializing
int[][] intTwoD;

// Initializing an empty 2D array which has already been declared
intTwoD = new int[5][5];

// Declaring and initializing an empty 2D array at once
String[][] stringData = new String[3][6];

// Declaring and initializing a 2D array using initializer lists
double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};

// Initializing a 2D array using initializer lists after it has already been declared, or already contains data;
char[][] letters = new char[100][250];
letters = new char[][]{{'a', 'b', 'c'}, {'d', 'e', 'f'}};


// :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

// Row-major order
for(int o = 0; o < letters.length; o++) {
  for(int i = 0; i < letters[o].length; i++) {
      char c = letters[o][i];
  }
}

// Column-major order
for(int o = 0; o < letters[0].length; o++) {
  for(int i = 0; i < letters.length; i++) {
      char c = letters[i][o];
  }
}

// :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
/*
Here is an example of traversal with conditional logic.

Given this 2D array of Strings:
*/
String[][] words = {{"championship", "QUANTITY", "month"},{"EMPLOYEE", "queen", "understanding"},{"method", "writer", "MOVIE"}};

// We are going to flip the capitalization of the words:

System.out.println("Before...");
System.out.println(Arrays.deepToString(words).replace("],", "],\n") + "\n");

for(int i=0; i<words.length; i++) {
    for(int j = 0; j<words[i].length; j++) {
        if(words[i][j]!=null) {

            // Check the capitalization
            boolean allCaps = true;
            for(char c : words[i][j].toCharArray())
                if(!Character.isUpperCase(c))
                    allCaps = false;

            // Flip the capitalization
            if(allCaps)
                words[i][j] = words[i][j].toLowerCase();
            else
                words[i][j] = words[i][j].toUpperCase();
        }
    }
}

System.out.println("After...");
System.out.println(Arrays.deepToString(words).replace("],", "],\n") + "\n");

// :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// Calendrier et Agenda

String[][] calendar = {{"volunteer", "delivery", null, null, "doctor", null, "soccer"}, {null, "exam 1", null, "mechanic", null, null, "soccer"}, {"volunteer", "off work", null, "birthday", null, "concert", null}, {null, "exam 2", null, null, "doctor", null, "soccer"}, {"visit family", null, null, null, null, null, null}};

for(int i = 0; i < calendar.length; i++) {
  numberOfEventsPerWeek = 0;
  for(int j = 0; j < calendar[i].length; j++) {
      // We need conditional logic to ensure that we do not count the empty days
      String event = calendar[i][j];
      if(event!=null && !event.equals("")) {
          // If the day does not have a null value and an empty string for an event, then we print it and count it
          System.out.println("Week: " + (i+1) + ", Day: " + (j+1) + ", Event: " + event);
          numberOfEventsPerWeek++;
      }
  }
  System.out.println("Total number of events for week "+ (i+1) +": " + numberOfEventsPerWeek + "\n");
}

int numberOfEventsPerWeekday = 0;
// We will use this array of day strings for our output later on so we don't have (day: 1)
String[] days = {"Sundays", "Mondays", "Tuesdays", "Wednesdays", "Thursdays", "Fridays", "Saturdays"};
for(int i = 0; i < calendar[0].length; i++) {
    numberOfEventsPerWeekday = 0;
    for(int j = 0; j < calendar.length; j++) {
        // Don't forget to flip the iterators in the accessor since we are flipping the direction we are navigating.
        // Remember, i now controls columns and j now controls rows
        String event = calendar[j][i];
        if(event!=null && !event.equals("")) {
            // Make sure we have an event for the day before counting it
            numberOfEventsPerWeekday++;
        }
    }
    // Use the days string array from earlier to convert the day index to a real weekday string
    System.out.println("Number of events on " + days[i] + ": " + numberOfEventsPerWeekday);
}
