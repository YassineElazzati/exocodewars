// obligatoire pour utiliser CharMarcher
import com.google.common.base.CharMatcher;

class Solution {
    static String removeExclamationMarks(String s) {
        // je declare dans une variable quel caractére je veux suprim.
        String charsToRemove = "!";
        //  j'utilise CharMatcher
        s = CharMatcher.anyOf(charsToRemove).removeFrom(s);

        return s;
    }
}

// supr les ! d'un String

String result = name.replaceAll("([a-z])","");
result = result.replaceAll("", ".");
return result;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
      
      String [] words = name.split(" ");
      String Letter = "";
      
     for (String word : words ){
          word.charAt(0);
       Letter = word;
          }
      return "";
    }
  }

  https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java