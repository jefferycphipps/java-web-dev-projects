package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        DVD movie = new DVD("Star Wars", "movie");
        CD biggie = new CD("life after death", "music");
        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(movie.spinDisc());
        System.out.println(movie.playDisc());
        System.out.println(movie);

        System.out.println(biggie.playDisc());
        System.out.println(biggie.spinDisc());
        System.out.println(biggie);
    }
}