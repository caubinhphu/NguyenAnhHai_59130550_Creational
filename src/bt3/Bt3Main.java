/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

import bt3.shape.ShapeType;
import bt3.shape.Shape;

/**
 *
 * @author Hai Tran Do
 */
public class Bt3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactogy shapeFatogy = new ShapeFactogy();
        Shape shapeRect = shapeFatogy.createShape(ShapeType.rectangle);
        Shape shapeCir = shapeFatogy.createShape(ShapeType.circle);
        Shape shapeTri = shapeFatogy.createShape(ShapeType.triangle);
          
        Shape shapeRect1 = shapeFatogy.createShape(ShapeType.rectangle);
        shapeRect1.setBrush("new Rectangle-brush");
        
        System.out.println(shapeRect.draw());
        System.out.println(shapeCir.draw());
        System.out.println(shapeTri.draw());

    }
    
}
