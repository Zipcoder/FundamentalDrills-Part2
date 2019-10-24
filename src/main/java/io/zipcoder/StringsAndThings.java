package io.zipcoder;


import java.util.Arrays;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        Integer answer = 0;
        String[] words = input.split(" ");
        for (String part : words){
          Character  lastElement = part.charAt(part.length() -1);
          if (lastElement == 'y' || lastElement == 'z'){
            answer += 1;
            }

        }
        return answer;

}/*first attempt atcountYZ
    public Integer countYZ(String input) {
        Integer answer = 0;
        String[] allWords = input.split(" ");
        String[] firstWord = input.split(" ", 0);
        String[] secondWord = input.split(" ", input.length() -1);
        for (int i = 0; i < allWords.length -1;i++){
            if (firstWord[firstWord.length -1].equals('y') || secondWord[secondWord.length -1].equals('z'));
            answer += 1;
        }
        return answer;
    }*/
    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        String input = base;
        String answer = input.replaceAll(remove, "");
        return answer;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        String addX = "n" + input + "n";
        String[] subOfIs = input.split("is");
        String[] subOfNot = input.split("not");

                return subOfIs.length -1 == subOfNot.length -1;
    }
        /*String[] subOfIs = input.split("is");
        String[] subOfNot = input.split("not");
        Integer numOfIs = 0;
        Integer numOfNot = 0;
        boolean answer = false;
        for (String i : subOfIs) {
            if (i.contains("is")) {
                numOfIs += 1;
            }
        }
        for (String i : subOfNot) {
            if (i.contains("not")) {
                numOfNot += 1;
            }
        }

        if (numOfIs.equals(numOfNot)) {
             answer = true;
        }else{

            answer = false;
        }

        return answer;

    }*/

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        String holder = " " + input + " ";
        for(int i = 1; i < holder.length() - 1; i++){
            char firstG = holder.charAt(i);
            char secondG = holder.charAt(i - 1);
            char thirdG = holder.charAt(i + 1);

            if (firstG == 'g' && firstG != secondG && firstG != thirdG){
            return false;
            }
        }

        return true;


    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        String holder = " " + input;
        Integer answer = 0;
        for(int i = 1; i < holder.length() - 2; i++){
            char firstG = holder.charAt(i);
            char secondG = holder.charAt(i + 1);
            char thirdG = holder.charAt(i + 2);

            if (firstG == secondG && firstG == thirdG){
                answer += 1;
            }
        }

        return answer;

    }
}
