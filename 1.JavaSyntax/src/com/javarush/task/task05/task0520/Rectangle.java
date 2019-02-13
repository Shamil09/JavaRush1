package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    private int top, left, width, height;
//- заданы 4 параметра: left, top, width, height
//- ширина/высота не задана (оба равны 0)
//- высота не задана (равно ширине) создаём квадрат
//- создаём копию другого прямоугольника (он и передаётся в параметрах)
    public Rectangle(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
        width=0;
        height=0;
    }

    public Rectangle(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        height=width;
    }

    public Rectangle(Rectangle rectangle) {
        top =rectangle.top;
        left=rectangle.left;
        width=rectangle.width;
        height=rectangle.height;
    }

    public static void main(String[] args) {

    }
}
