package org.launcode;

import java.util.Arrays;

public class ArrayPrac {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,5,8};
        for(int x = 0; x<arr.length; x++){
            if(arr[x]%2 !=0) {
                System.out.println(arr[x]);
            }
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));
        String[] sentence = phrase.split("\\.");
        System.out.println(Arrays.toString(sentence));
    }

}
