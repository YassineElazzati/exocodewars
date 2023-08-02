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