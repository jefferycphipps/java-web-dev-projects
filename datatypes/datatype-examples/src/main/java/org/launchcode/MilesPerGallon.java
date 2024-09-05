package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you drove?");
        float miles = input.nextFloat();
        System.out.println("How many gallons did you use?");
        float gallons = input.nextFloat();
        float mpg = miles/gallons;
        System.out.println("You had a miles per gallon of " + mpg);
    }
}
