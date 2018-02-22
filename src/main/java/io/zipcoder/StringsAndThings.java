package io.zipcoder;

public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        int yZcount =0;
        String[] splitWords = (input.toLowerCase().split(" "));
        for (int i =0 ; i < splitWords.length; i++) {
            if (splitWords[i].endsWith("y") || splitWords[i].endsWith("z")) {
                yZcount ++;
            }
        }
        return yZcount;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : withoutString("Hello there", "llo") // Should return "He there"
     *           withoutString("Hello there", "e") //  Should return "Hllo thr"
     *           withoutString("Hello there", "x") // Should return "Hello there"
     */
    public String withoutString(String base, String remove){
        String stringWOut=  base.replaceAll(remove, "");
        return stringWOut;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : equalIsNot("This is not")  // Should return false
     *           equalIsNot("This is notnot") // Should return true
     *           equalIsNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean equalIsNot(String input){

        String stringWithoutIs = input.replaceAll("is", "");
        int countIs = (input.length() - stringWithoutIs.length()) /2 ;
        String stringWithoutNot = input.replaceAll("not", "");
        int countNot = (input.length() - stringWithoutNot.length()) /3 ;
        if (countIs == countNot) return true;
        else return false;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        boolean happiness = false;
        int singleGCount = 0;
            for (int i = 1; i < input.length()-1; i++) {
                if (input.charAt(i) == 'g') {
                    if ((input.charAt(i - 1) != 'g' && (input.charAt(i+1)) != 'g')) {
                        singleGCount++;
                    }
                }
            }
            if (singleGCount <= 0) happiness = true;
            return happiness;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){


        int countTri = 0;
        if (input.length() > 3) {
            for (int i = 1; i < input.length()-1; i++) {
                if (input.charAt(i - 1) == (input.charAt(i)) && (input.charAt(i)) == (input.charAt(i+1))) {
                    countTri++;
                }
            }
        } else return 0;
        return countTri;
    }
}
