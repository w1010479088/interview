package com.lrlz.interview;

class Shape {
    private Pencil pencil = new Pencil("Shape");

    Shape() {
        LogUtil.log("Shape()");
    }
}

class Circle extends Shape {
    private Pencil pencil = new Pencil("Circle");
    private static Pen pen = new Pen();

    private Circle() {
        LogUtil.log("Circle()");
    }


    public static void main(String[] args) {
        new Circle();
    }
}

class Pencil {
    Pencil(String tag) {
        LogUtil.log("Pencil()" + tag);
    }
}

class Pen {
    Pen() {
        LogUtil.log("Pen()");
    }
}
