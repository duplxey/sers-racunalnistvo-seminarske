package com.yourname.projectname.core.shapes;

import com.yourname.projectname.core.shapes.threedimensional.Cube;
import com.yourname.projectname.core.shapes.twodimensional.Circle;

public class ShapeMain {

    public static void main(String[] args) {
        Cube cube = new Cube(5);
        System.out.println("-*- Cube -*-");
        System.out.println("a: " + cube.getA());
        System.out.println("surface: " + cube.getSurface());
        System.out.println("volume: " + cube.getVolume());
        System.out.println("diagonal: " + cube.getDiagonal());

        System.out.println("-*- Circle -*-");
        Circle circle = new Circle(2.5);
        System.out.println("r: " + circle.getR());
        System.out.println("area: " + circle.getArea());
        System.out.println("diagonal: " + circle.getDiagonal());
    }
}
