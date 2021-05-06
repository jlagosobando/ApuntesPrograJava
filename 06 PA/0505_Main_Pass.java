package com.example.dev;



public class Main_Pass {



public static String Gen_Pass(){
    String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String min = may.toLowerCase();
    String nums = "0123456789";
    String alphanums = may+min+nums;
    int i;

    int randomLength= 6 + (int)(Math.random() * 4);

    StringBuilder pass = new StringBuilder(randomLength);


    pass.append(may.charAt((int)(Math.random() * may.length())));

    for(i=1; i<randomLength-1;i++){
        pass.append(alphanums.charAt((int)(Math.random() * alphanums.length())));
    }

    pass.append(nums.charAt((int)(Math.random() * nums.length())));


    return pass.toString();
}




}
