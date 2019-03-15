package com.lrlz.interview;

abstract class Shape {

    abstract void draw();

    Shape() {
        LogUtil.log("before Shape()->draw()");
        draw();
        LogUtil.log("after Shape()->draw()");
    }
}

class Circle extends Shape {
    private int index = 100;

    Circle() {
        LogUtil.log("Circle()");
        draw();
    }

    @Override
    void draw() {
        LogUtil.log("Circle->draw()-->index=" + index);
    }

    public static void main(String[] args) {
        new Circle();
    }
}
