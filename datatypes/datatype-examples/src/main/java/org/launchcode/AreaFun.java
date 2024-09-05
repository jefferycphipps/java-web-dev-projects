package org.launchcode;
import java.util.Scanner;

public class AreaFun {
    public static void main(String[] args0) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your length?");
        int length = input.nextInt();
        System.out.println("What is your width?");
        int width = input.nextInt();
        int area = length*width;
        System.out.println("The area of your rectangle is " + area);
    }
}
