package com.jrda.design_patterns.prototype.shapes;

public class Circle extends ColorShape {
    public double radius;

    public Circle() {
    }

    public Circle(Circle circle) {
        super(circle);
        if(circle != null){
            this.radius = circle.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }

        if(!(obj instanceof Circle) || !super.equals(obj)){
            return false;
        }

        Circle circle = (Circle) obj;

        return this.radius == circle.radius;
    }
}
