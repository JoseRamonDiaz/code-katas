package com.jrda.design_patterns.prototype.shapes;

public class ColorShape extends Shape {
    public String color;

    public ColorShape() {
    }

    public ColorShape(ColorShape colorShape) {
        super(colorShape);
        if(colorShape != null){
            this.color = colorShape.color;
        }
    }

    @Override
    public Shape clone() {
        return new ColorShape(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }

        if(!(obj instanceof ColorShape) || !super.equals(obj)){
            return false;
        }

        ColorShape colorShape = (ColorShape) obj;

        return this.color == colorShape.color;
    }
}