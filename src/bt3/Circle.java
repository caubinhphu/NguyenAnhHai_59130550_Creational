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
public class Circle extends Shape{

    private static Shape circle;
    
    protected Circle() {
        super("Circle-brush", "Circle-paper", "Circle-frame");
    };

    public static Shape createCircle() {
        if (circle == null) {
            circle = new Circle();
        }
        return circle;
    }
    
    @Override
    public String draw() {
        return "Draw circle: " + getBrush() + ", " + getPaper() + ", " + getFrame();
    }
    
}
