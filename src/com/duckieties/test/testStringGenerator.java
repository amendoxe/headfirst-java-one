package com.duckieties.test;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class testStringGenerator {
    public static void main(String[] args) {


        String[] wordListOne = {"pancake", "car", "Carl", "Dos", "something", " another", "quienes", "trying"};
        String[] wordListTwo = {"esquite", "tamal", "hot dog ", "teclado", "monitor"};
        String[] wordListThree = {"ball", "football", "light", "gurl", "actor"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        java.util.Random randomGenerator = new Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        String phrase = wordListOne[rand1] + " " + "this" + " " + wordListTwo[rand2] + " " + "into the" + " " + wordListThree[rand3];

        System.out.println(phrase);

    }
}