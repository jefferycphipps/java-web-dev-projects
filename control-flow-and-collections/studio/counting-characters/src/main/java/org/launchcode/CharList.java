package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharList {
    public static void main(String[] args) {
        //String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        //Scanner input = new Scanner(System.in);
        //char[] characters = phrase.toLowerCase().toCharArray();
        HashMap<Character, Integer> charlist = new HashMap<>();
        //System.out.println("What is the phrase that pays?");
        //String userString = input.nextLine();
        //char[] characters = userString.toLowerCase().toCharArray();
        String line = null;
        try (BufferedReader br = new BufferedReader(new FileReader("control-flow-and-collections/studio/counting-characters/src/main/java/org/launchcode/text.txt"))) {
            line = br.readLine();
            //System.out.println(line);
            /*while ((line = br.readLine()) != null) {
                System.out.println(line);
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(line);
        char[] characters = line.toLowerCase().toCharArray();



        for(int x = 0; x<characters.length;x++){
            if(charlist.containsKey(characters[x])){
                int count = charlist.get(characters[x]);
                count++;
                charlist.put(characters[x], count);
            }else{
                charlist.put(characters[x], 1);
            }

        }

        for(Map.Entry<Character, Integer> character : charlist.entrySet()) {
            System.out.println(character.getKey() + " " + character.getValue());
        }
    }
}
