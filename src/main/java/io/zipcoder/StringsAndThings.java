package io.zipcoder;

import java.util.Arrays;

public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        String[] result = input.split(" ");
        Integer count = 0; //initialize our counter
        for (int i = 0; i < result.length; i++) { //loop through the array of integers, if my object(int) is 7 my counter will increment by 1 until it has finished looping through each element of my object array
            if (result[i].endsWith("y") || result[i].endsWith("z")) {
                count++;
            }
        }

        return count;
        //count the Z's & Y's at the length of the string but not the first index
        //get length
        //split string array
        //loop through array elements
        // if the iteration of result ends with a y or z then increase the numbers of occurences
        //return the number of times y or  z occurs in the strings
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
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

    //this method works as well but it too much and not very clean
    //for (int i = 0; i <= base.length() - remove.length(); i++) {
//            if (base.substring(i, i + remove.length()).equals(remove)) {
//                base = base.substring(0, i) + base.substring(i + remove.length(), base.length());
//                i--;
//            }
//        }
//        return base;
//    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : equalIsNot("This is not")  // Should return false
     * equalIsNot("This is notnot") // Should return true
     * equalIsNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean equalIsNot(String input) {
//loop through string
//if input contains "is" or "not" then record the number of times it occurs
//return true if "is" and "not" have equivalent occurences
//otherwise return false
        CharSequence occurrenceOne = "is";
        CharSequence occurrencetwo = "not";
        for (int i  = 0; i < input.length(); i++) {
            if (input.contains(occurrenceOne) || input.contains(occurrencetwo))
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
        CharSequence happyG = "gg";
        if (input.contains(happyG)) {
        return true;
    }

    return false;
}
    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        int tripCount = 0;
        char[] tripArr = input.toCharArray();
        for (int i = 2; i < tripArr.length; i++) {
            if (tripArr[i] == tripArr[i - 1] && tripArr[i] == tripArr[i - 2]) {
                tripCount++;
            }
        }
        return tripCount;
    }
}