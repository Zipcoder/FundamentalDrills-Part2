package io.zipcoder;

import java.util.ArrayList;

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

        String [] inputArr = input.split(" ");
        Integer count = 0;
        String temp = "";
        for (int i = 0; i < inputArr.length; i++){
            temp = inputArr[i].substring(inputArr[i].length()-1);
            if(temp.equalsIgnoreCase("y") || temp.equalsIgnoreCase("z")){
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
    public String withoutString(String base, String remove) {

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
    public Boolean equalIsNot(String input) {

        return countIt(input, "is") == countIt(input, "not");
    }

//CREATED A NEW METHOD
    public int countIt(String str, String s){
        int count=0;
        while(str.contains(s)){
            count++;
            str=str.substring(str.indexOf(s) + s.length());
        }
        return count;
    }



    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        for (int i = 0; i < input.length(); i++){
            if (input.matches("gg")){
                return true;
            }
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
    public Integer countTriple(String input){
        char [] inputArr = input.toCharArray();
        Integer count = 0;
        for(int i = 1; i < input.length(); i++){
            if (inputArr[i-1] ==(inputArr[i]) && inputArr[i] ==(inputArr[i+1])){
                count++;
            }
        }
        return count;
    }
}
