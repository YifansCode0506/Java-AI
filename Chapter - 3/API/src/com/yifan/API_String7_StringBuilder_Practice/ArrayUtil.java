package com.yifan.API_String7_StringBuilder_Practice;

public class ArrayUtil {
    public static String arrayToString(int[] arr){
        String str = "[";
        for(int i=0;i<arr.length;i++){
            if(i == arr.length-1){
                str += arr[i]+"]";
            }else{
                str += arr[i]+",";
            }
        }
        return str;
    }
    public static String arrayToString2(int[] arr){
        StringBuffer sb = new StringBuffer("[");

        for(int i=0;i<arr.length;i++){
            if(i == arr.length-1){
                sb.append(arr[i]);
                sb.append("]");
            }else {
                sb.append(arr[i]);
                sb.append(", ");
            }
        }
        return sb.toString();
    }

}
