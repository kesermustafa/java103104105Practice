package dayArrays;

import java.util.Arrays;
import java.util.Comparator;

public class Soru01 {
     /*
        Example 1:

        Input: strs = ["flower","flow","flight"]
        Output: "fl"

        Example 2:
        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.

     */

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};

        Arrays.sort(strs, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(strs));
        String varMi = "";

            for (int k = 0; k < strs[0].length(); k++) {

                if ( strs[1].contains(strs[0].substring(k,k+1)) ){

                    if ( strs[2].contains(strs[0].substring(k,k+1)) ){

                        varMi += strs[0].substring(k, k + 1);
                    }
                }
            }

        System.out.println(varMi);

            //===========================

        String varMi2 = "";
        for (int k = 0; k < strs[0].length(); k++) {

            if ( strs[1].contains(strs[0].substring(k,k+1)) && strs[2].contains(strs[0].substring(k,k+1))){
                    varMi2 += strs[0].substring(k, k + 1);
            }
        }
        System.out.println("varMi2 = " + varMi2);

        //===========================

        String varMi3 = "";

        String[] str1 = strs[0].split("");
        String str2 = strs[1];
        String str3 = strs[2];
        System.out.println(Arrays.toString(str1));

        for(int i = 0; i<str1.length; i++){

            if(str2.contains(str1[i]) && str3.contains(str1[i]) ){

                varMi3 += str1[i];
            }

        }
        System.out.println("varMi3 = " + varMi3);


    }
    }


