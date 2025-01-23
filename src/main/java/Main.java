

public class Main {
	
public static void main(final String[] args) {
	PigLatin sim = new PigLatin();
        //sim.tester();
	}
}
String[] lines = {"beast","dough","happy","question","star","three","eagle","try"};
public void setup(){
  for(int i = 0; i < lines.length;i++){
    if(findFirstVowel(lines[i]) == -1)
     System.out.println(lines[i] + "ay");
    else if(findFirstVowel(lines[i]) == 0)
     System.out.println(lines[i] + "way");
    else if(lines[i].substring(0,2).equals("qu"))
      System.out.println(lines[i].substring(2,lines[i].length()) + "qu" + "ay");
     else
   System.out.println(lines[i].substring(findFirstVowel(lines[i]),lines[i].length()) + lines[i].substring(0,findFirstVowel(lines[i])) +"ay");
  }
}
	
public int findFirstVowel(String lines){
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

