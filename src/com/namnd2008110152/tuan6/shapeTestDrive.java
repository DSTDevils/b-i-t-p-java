/*
* created date:27 Oct 2021
* author: cgm
*/
package com.namnd2008110152.tuan6;

public class shapeTestDrive {
    public static void main(String[] args){
        Circle circle = new Circle("gonna never get you up");
        circle.rotate();
        circle.playSound();

        Square square = new Square("gonna never let you down");
        square.rotate();
        square.playSound();

        Triangle triangle = new Triangle("Never gonna run around and desert you");
        triangle.rotate();
        triangle.playSound();
    }
}
