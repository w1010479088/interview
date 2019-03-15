package com.lrlz.interview;

class Shape {
    private static Pencil pencil = new Pencil("Shape");

    Shape() {
        LogUtil.log("Shape()");
    }
}

class Circle extends Shape {
    private Pen pen = new Pen();
    private static Pencil pencil = new Pencil("Circle");

    private Circle() {
        LogUtil.log("Circle()");
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
