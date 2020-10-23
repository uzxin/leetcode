package com.letcode.easy;

/**
 * @description:
 * @author: YX
 * @date: 2020/10/23 10:18
 */
public class 最长公共前缀 {

    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};
        String[] strs3 = {"flower","flower","flower","flower"};
        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));
        System.out.println(longestCommonPrefix(strs3));
    }

    public static String longestCommonPrefix(String[] strs) {
        String  result = "";
        if (null == strs || strs.length==0 || "".equals(strs[0])){
            return result;
        }
        if (strs.length == 1){
            return strs[0];
        }
        Boolean flag = true;
        String s = "";
        for (int i = 0; i < strs[0].length(); i++) {
            s += strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(s)){
                    flag = false;
                }
            }
            if (flag){
                result = s;
            }
        }
        return result;
    }
}