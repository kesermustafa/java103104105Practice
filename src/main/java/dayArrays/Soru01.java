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




//        for (int k = 0; k < strs[0].length(); k++) {
//
//            if ( strs[1].contains(strs[0].substring(k,k+1)) && strs[2].contains(strs[0].substring(k,k+1))){
//                varMi += strs[0].substring(k, k + 1);
//            }
//
//        }

        System.out.println(varMi);




        }
    }


