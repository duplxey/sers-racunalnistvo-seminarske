package com.yourname.projectname.letnik_3.shapes;

import com.yourname.projectname.letnik_3.shapes.twodimensional.Shape;

public abstract class Shape3D extends Shape {

    public Shape3D(String name, String description) {
        super(name, description);
    }

    public abstract double getSurface();
    public abstract double getVolume();
}
