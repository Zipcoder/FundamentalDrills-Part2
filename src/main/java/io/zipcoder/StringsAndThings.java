package io.zipcoder;

public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z'
     * in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if
     * there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        Integer count = 0;
        String[] s = input.trim().toLowerCase().split(" ");
        for (String element : s) {
            if (element.charAt(element.length() - 1) == 'y' || element.charAt(element.length() - 1) == 'z') {
                count++;
            }

        }
        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove
     * string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : withoutString("Hello there", "llo") // Should return "He there"
     * withoutString("Hello there", "e") //  Should return "Hllo thr"
     * withoutString("Hello there", "x") // Should return "Hello there"
     */
    public String withoutString(String base, String remove) {
        return base.replaceAll(remove, "");
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : equalIsNot("This is not")  // Should return false
     * equalIsNot("This is notnot") // Should return true
     * equalIsNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean equalIsNot(String input) {
        CharSequence is = "is";
        CharSequence not = "not";
        Integer count = 0;
        Integer anotherCount = 0;

        if (input.contains(is)){
            count++;
        }
        if (input.contains(not)){
            anotherCount++;
        }
        if (count == anotherCount){
            return true;
        }
        return false;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
    CharSequence gg = "gg";
    if (input.contains(gg)){
        return true;
    }

        return false;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
   Integer counter = 0;
    char [] inputArray = input.toLowerCase().toCharArray();
        for (int i = 1; i < inputArray.length; i++){
            if (inputArray[i] == inputArray[i-1] && inputArray[i] == inputArray[i+1]){
                counter++;
            }
        }
        return counter;
    }
}
