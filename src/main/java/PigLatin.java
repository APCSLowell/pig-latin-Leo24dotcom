import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PigLatin {
    
    public void tester() {
        // String[] lines = loadStrings("words.txt");
        String[] lines = new String[8]; 
        try{
            File myFile = new File("words.txt");
            Scanner myReader = new Scanner(myFile);
            int counter = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lines[counter] = data;
                counter++;
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
	    System.out.println("there are " + lines.length + " lines");
	    for (int i = 0 ; i < lines.length; i++) {
	        System.out.println(pigLatin(lines[i]));
	    }
    }
    public int findFirstVowel(String sWord) {
        //precondition: sWord is a valid String of length greater than 0.
        //postcondition: returns the position of the first vowel in sWord.  If there are no vowels, returns -1
	    // your code goes here
	      String vowel = new String("aeiou");
  int count = -1;
  for(int i = 1; i <= lines.length(); i++){
    for(int x = 1; x <= vowel.length(); x++){
    if(lines.substring(i-1,i).equals (vowel.substring(x-1,x)))
      return i -1;
    }
  }
  return count;

    }

    public String pigLatin(String sWord) {
        //precondition: sWord is a valid String of length greater than 0
        //postcondition: returns the pig latin equivalent of sWord
        // more code should go here
	    if(findFirstVowel(sWord) == -1) {
		    return sWord + "ay";
	    }
		      for(int i = 0; i < lines.length;i++){
    if(findFirstVowel(lines[i]) == -1){
     System.out.println(lines[i] + "ay");
    }
    else if(findFirstVowel(lines[i]) == 0){
     System.out.println(lines[i] + "way");
    }
    else if(lines[i].substring(0,2).equals("qu")){
      System.out.println(lines[i].substring(2,lines[i].length()) + "qu" + "ay");
    }
     else{
   System.out.println(lines[i].substring(findFirstVowel(lines[i]),lines[i].length()) + lines[i].substring(0,findFirstVowel(lines[i])) +"ay");
     }
  }
	    else {
		return "ERROR!";
	    }
    }
}//end PigLatin class
