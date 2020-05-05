/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author Hai Tran Do
 */
public class Bt2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStringBuilder str = new MyStringBuilder("Trường")
                                .addString(" đại học")
                                .addString(" Nha Trang ")
                                .addFloat(1.1f)
                                .addBool(true);
//                                .build();
        str.addString(" bla bla...");
        
        System.out.println(str);
    }
    StringBuilder a;
}
