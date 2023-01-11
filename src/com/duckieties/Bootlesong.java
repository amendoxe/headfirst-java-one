package com.duckieties;

public class Bootlesong {
    public static void main(String[] args) {
        int bottlesNum = 4;
        String word = "bottles";
        while (bottlesNum > 0) {
            if (bottlesNum == 1) word = "bottle";
            System.out.println(bottlesNum + " green" + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green" + word + ", hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall, ");
            bottlesNum--;
            if (bottlesNum > 0)
                System.out.println("there'll be " + bottlesNum + " green" + word + ", hanging on the wall");
            else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            }
        }
    }
}
