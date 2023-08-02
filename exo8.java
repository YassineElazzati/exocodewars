

public class RemoveChars {
    public static String remove(String str) {

        //substring fonction pour limiter les caractére du coup je retourne l'index 1 (2eme lettre ) et (m'arette à 1 index avant la fin de str pur afficher le mot sans la derniére lettre)
return str.substring(1, str.length() - 1);
        // your code here
    }
}


//It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string. You're given one parameter, the original string. You don't have to worry with strings with less than two characters.