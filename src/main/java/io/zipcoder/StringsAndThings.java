package io.zipcoder;


/**
 * @author tariq
 */
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
        /*String[] inputArr = input.split(" ");
        for (String s : inputArr){

        -Make array of the words
        -loop over the words
            -test for last letter
            if y or z
            counter++
            */

        int count = 0;
        Character y = 'y';
        Character z = 'z';
        for (int i = 0; i < input.length() - 2; i++) {
            if (Character.isLetter(input.charAt(i + 1)) == false && (input.charAt(i) == y || input.charAt(i) == z)) {
                count++;
            }
        }
        if (input.charAt(input.length() - 1) == y || input.charAt(input.length() - 1) == z) {
            count++;

        }
        return count;


    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
        return base.replaceAll(remove, "");
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * +        containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        int countIs = 0;
        int countNot = 0;

        char[] charArray = input.toCharArray();

        char i = 'i';
        char s = 's';
        char n = 'n';
        char o = 'o';
        char t = 't';

        for (int count = 0; count < charArray.length - 1; count++) {
            if (charArray[count] == i && charArray[count + 1] == s) {
                countIs++;
            }
            if (charArray[count] == n && charArray[count + 1] == o && charArray[count + 2] == t) {
                countNot++;
            }
        }
        return countIs == countNot;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        char z = 'g';
        char[] falafal = input.toCharArray();
        boolean happy = false;
        for (int x = 0; x < falafal.length; x++) {
            if (falafal[x] == z && falafal[x + 1] == z) {
                happy = true;
            } else if (falafal[x] == z && falafal[x - 1] != z) {
                happy = false;
            }

        }
        return happy;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        char[] falafal = input.toCharArray();
        int count = 0;
        for (int x = 0; x < falafal.length - 1; x++) {
            if (falafal[x + 1] == falafal[x] && falafal[x + 2] == falafal[x]) {
                count++;
            }
        }
        return count;
    }

}
