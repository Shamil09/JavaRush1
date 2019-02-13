package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    private int top, left, width, height;

    public void initialize(int left, int top,  int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void initialize(int left, int top) {
        this.top = top;
        this.left = left;
        width = 0;
        height = 0;
    }

    public void initialize(int left, int top,  int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        height = width;
    }
    public void initialize(Rectangle rectangle) {
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }
    public void initialize(int left) {
        top = 0;
        this.left = left;
        this.width = 10;
        this.height = 10;
    }
    public static void main(String[] args) {

    }
}
