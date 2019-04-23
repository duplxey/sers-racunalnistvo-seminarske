package com.yourname.projectname.core.shapes;

import com.yourname.projectname.core.shapes.twodimensional.Shape;

public abstract class Shape3D extends Shape {

    public Shape3D(String name, String description) {
        super(name, description);
    }

    public abstract double getSurface();
    public abstract double getVolume();
}
