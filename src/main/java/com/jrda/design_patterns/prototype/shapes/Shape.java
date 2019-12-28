package com.jrda.design_patterns.prototype.shapes;

public abstract class Shape {
    public int x;
    public int y;

    public Shape() {
    }

    public Shape(Shape shape) {
        if(shape != null){
            this.x = shape.x;
            this.y = shape.y;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }

        if(!(obj instanceof Shape)){
            return false;
        }

        Shape shape = (Shape) obj;

        return this.x == shape.x && this.y == shape.y;
    }
}
