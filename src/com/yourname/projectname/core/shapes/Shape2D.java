package com.yourname.projectname.core.shapes;

import com.yourname.projectname.core.shapes.twodimensional.Shape;

public abstract class Shape2D extends Shape {

    public Shape2D(String name, String description) {
        super(name, description);
    }

    public abstract double getArea();
}
