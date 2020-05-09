/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author Hai Tran Do
 */
public class Triangle extends Shape {
 
    private static Shape triangle;
    
    protected Triangle() {
        super("Triangle-brush", "Triangle-paper", "Triangle-frame");
    };

    public static Shape createTriangle() {
        if (triangle == null) {
            triangle = new Triangle();
        }
        return triangle;
    }
    
    @Override
    public String draw() {
        return "Draw triangle: " + getBrush() + ", " + getPaper() + ", " + getFrame();
    }
    
}
