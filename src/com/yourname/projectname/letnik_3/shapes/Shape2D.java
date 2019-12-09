package com.yourname.projectname.letnik_3.shapes;

import com.yourname.projectname.letnik_3.shapes.twodimensional.Shape;

public abstract class Shape2D extends Shape {

    public Shape2D(String name, String description) {
        super(name, description);
    }

    public abstract double getArea();
}
