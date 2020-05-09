/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3.shape;

import bt3.shape.Shape;

/**
 *
 * @author Hai Tran Do
 */
public class Rectangle extends Shape{

    private static Shape rectangle;

    protected Rectangle() {
        super("Rectangle-brush", "Rectangle-paper", "Rectangle-frame");
    }
    
    public static Shape createRectangle() {
        if (rectangle == null) {
            rectangle = new Rectangle();
        }
        return rectangle;
    }
    
    @Override
    public String draw() {
        return "Draw rectangle: " + getBrush() + ", " + getPaper() + ", " + getFrame();
    }
    
}
