package org.example;

import java.util.StringTokenizer;

public class Calculation {
    //method that finds the maximum number in an array
    public static Integer findMax (Integer[] array1) {
        int maxi = array1[0];
        for (int i = 0; i < array1.length; i++){
            if(maxi < array1[i]){
                maxi = array1[i];
            }
        }
        return maxi;
    }

    //method that returns cube of any given number
    public static int cube (int number){
        return (int) Math.pow(number, 3);
    }

    //method that returns reverse words
    public static String wordReversal(String str){
        StringBuilder result = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(str, " ");

        while (tokenizer.hasMoreTokens()){
            StringBuilder sb = new StringBuilder();
            sb.append(tokenizer.nextToken());
            sb.reverse();

            result.append(sb);
            result.append(" ");
        }
        return result.toString();
    }
    /*
    NB: Tokenization is the act of breaking up a sequence of strings
        into pieces such as words, keywords, phrases, symbols
        and other elements called tokens.

        The StringBuilder works by maintaining a buffer of characters (Char)
        that will form the final string.
        Characters can be appended, removed and manipulated via the StringBuilder,
        with the modifications being reflected by updating the character buffer accordingly.
        An array is used for this character buffer.
     */
}
