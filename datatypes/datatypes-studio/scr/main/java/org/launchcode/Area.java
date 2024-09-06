package org.launchcode;
import java.util.Scanner;


public class Area {
    public static void main(String[] args){
    //double pi = 3.14;
    Scanner input = new Scanner(System.in);
    double radius;
    do{
        System.out.println("Enter a radius:");
        radius = input.nextDouble();
        if(radius<=0)
            System.out.println("Radius should be greater than zero");
        
    }while (radius<=0);
    double area = Circle.getArea(radius);

    System.out.println("The area of the circle is " + area);





    }
}
