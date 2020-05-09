/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

import bt3.shape.Rectangle;
import bt3.shape.ShapeType;
import bt3.shape.Shape;
import bt3.shape.Triangle;
import bt3.shape.Circle;

/**
 *
 * @author Hai Tran Do
 */
public class ShapeFactogy {
    public Shape createShape(ShapeType shapeType) {
        if (null != shapeType) switch (shapeType) {
            case rectangle:
                return Rectangle.createRectangle();
            case circle:
                return Circle.createCircle();
            case triangle:
                return Triangle.createTriangle();
            default:
                break;
        }
        return null;
    }
}
