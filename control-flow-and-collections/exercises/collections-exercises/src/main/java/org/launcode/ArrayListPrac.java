package org.launcode;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPrac {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int x = 1; x<=100; x++){
            numbers.add(x);
        }
        int sum = evenSum(numbers);
        System.out.println("The sum of even numbers 1-100 is " + sum);

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> words = new ArrayList<String>(Arrays.asList(phrase.split(" ")));
        fiveLetters(words);


    }
    public static int evenSum(ArrayList<Integer> array){
        int sum = 0;
        for(int integer: array){
            if(integer%2==0){
                sum = sum + integer;
            }
        }
        return sum;
    }
    public static void fiveLetters(ArrayList<String> array){
        for(String word: array){
            if(word.length()==5){
                System.out.println(word);
            }
        }
    }
}
