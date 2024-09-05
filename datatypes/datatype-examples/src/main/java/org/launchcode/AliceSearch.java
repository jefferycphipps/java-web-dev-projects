package org.launchcode;
import java.util.Scanner;

public class AliceSearch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String passage = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, " +
                "‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        System.out.println("What word would you like to find?");
        String word = input.next();
        boolean inPassage = passage.toLowerCase().contains(word);
        if(inPassage){
            int index = passage.indexOf(word);
            int length = word.length();
            System.out.println("The word is in the passage. Its location is " + index + " and it is " + length + " letters long.");
            String newPassage = passage.replace(word, "");
            System.out.println(newPassage);
        }else
            System.out.println("The word is not in the passage.");
    }
}
