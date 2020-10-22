package com.letcode.easy;

/**
 * @description:
 * @author: YX
 * @date: 2020/10/22 10:24
 * 《题目描述》
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转
 *
 * 《示例》
 * 输入: 123输出: 321
 * 输入: -123输出: -321
 * 输入: 120输出: 21
 */
public class 整数反转 {

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(0));
    }

    public static int reverse(int x) {
        String s = String.valueOf(x);
        StringBuilder reverse = new StringBuilder(s).reverse();
        if (reverse.toString().startsWith("0") && reverse.length() != 1){
            reverse.deleteCharAt(0);
        }
        int result;
        try {
            if (reverse.toString().endsWith("-")){
                reverse.deleteCharAt(reverse.length()-1);
                result = Math.abs(Integer.parseInt(reverse.toString()))*(-1);
            }else {
                result = Integer.parseInt(reverse.toString());
            }
        }catch (Exception e){
            result = 0;
        }
        return result;
    }
}