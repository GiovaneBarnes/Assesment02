package com.stayready.assessment.week2.part01;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2)
    {
        String newString = string1+ string2;
        return newString;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        StringBuilder input1 = new StringBuilder();
        input1.append(string1);
        input1 = input1.reverse();
        return input1.toString();

    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        StringBuilder input1 = new StringBuilder();
        input1.append(string1);
        input1 = input1.reverse();
        StringBuilder input2 = new StringBuilder();
        input2.append(string2);
        input2 = input2.reverse();
        return input1.append(input2).toString();



    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
            String newString = "";
            String newerString = "";
            for(int i = 0; i < charactersToRemove.length(); i++){
                newString = charactersToRemove.substring(i, i+1);
                string = string.replaceAll(newString, "");
                newString = "";

        }
            return string;
    }


    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String newString = "";
        String newerString = "";
        for(int i = 0; i < charactersToRemove.length(); i++){
            newString = charactersToRemove.substring(i, i+1);
            string = string.replaceAll(newString, "");
            newString = "";

        }
        StringBuilder input1 = new StringBuilder();
        input1.append(string);
        input1 = input1.reverse();
        return input1.toString();
    }
}
