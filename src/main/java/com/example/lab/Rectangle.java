package com.example.lab;

public class Rectangle {
    int x;
    int y;
    int length;
    int width;
    public Rectangle(int initX, int initY, int initLength, int initWidth){
        x = initX;
        y = initY;
        length = initLength;
        width = initWidth;
    }
    public String toString(){
        return x +"," + y +"," + width+","+length;
    }

}


