package com.yourname.projectname.core.shapes;

import com.yourname.projectname.core.shapes.threedimensional.Cube;
import com.yourname.projectname.core.shapes.twodimensional.Circle;

public class ShapeMain {

    public static void main(String[] args) {
        Cube cube = new Cube(5);
        System.out.println(cube.getA());
        System.out.println(cube.getSurface());
        System.out.println(cube.getVolume());
        System.out.println(cube.getDiagonal());

        Circle circle = new Circle(2.5);
        System.out.println(circle.getR());
        System.out.println(circle.getArea());
        System.out.println(circle.getDiagonal());
    }
}
