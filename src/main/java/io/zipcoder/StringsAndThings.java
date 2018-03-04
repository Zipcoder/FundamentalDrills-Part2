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
    public Integer countYZ(String input) {
        String[] temp = input.split(" ");
        int count = 0;

        for (int x = 0; x < temp.length; x++) {
            if (temp[x].substring(temp[x].length() - 1).equals("y")) {
                count++;
            } else if (temp[x].substring(temp[x].length() - 1).equals("z")) {
                count++;
            }


        }
        return count;
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

        return base.replaceAll(remove, "");
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
        int originalSize = input.length();
        String newIs = input.replaceAll("is", "");
        int removedIs = (originalSize - newIs.length()) / 2;
        String newNot = input.replaceAll("not", "");
        int removedNot = (originalSize - newNot.length()) / 3;

        return (removedIs == removedNot);
    }

//    return countIt(input, "is") == countIt(input, "not");
//}
//
//    public int countIt(String str, String s){
//        int count=0;
//        while(str.contains(s)){
//            count++;
//            str=str.substring(str.indexOf(s) + s.length());
//        }
//        return count;
//    }
//
    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {


        int countGG = 0;

        for (int i = 0; i < input.length() -2; i++) {
            if (input.charAt(0) == ('g') && (input.charAt(1) != 'g')) {
                return false;
            } else if (input.charAt(i + 1) == 'g' && (input.charAt(i) == 'g' || input.charAt(i + 2) == 'g')) {
                countGG++;
            } else if (input.charAt(i + 1) == 'g' && (input.charAt(i) != 'g' && input.charAt(i + 2) != 'g')) {
                return false;
            } else if (input.charAt(input.length() - 1) == 'g' && (input.charAt(input.length() - 2) != 'g')) {
                return false;
            }
        }

        return (countGG > 0);
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        return null;
    }
}
