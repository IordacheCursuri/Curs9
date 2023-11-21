package com.itFactory.exercitii;

public class Exercitiu1 {
    public static void main(String[] args) {
        String x = "([{{[(]}}])";

        System.out.println(isBalanced(x));
    }


    public static boolean isBalanced(String str){
        if(str == null || str.isEmpty()){
            return false;
        }

        while (str.contains("()") || str.contains("[]") || str.contains("{}")){

            str = str.replace("()", "")
                    .replace("[]", "")
                    .replace("{}", "");

            if(str.isEmpty()){
                return true;
            }
        }

        return false;
    }


}
