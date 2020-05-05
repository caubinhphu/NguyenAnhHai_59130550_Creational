/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Hai Tran Do
 */
public class Bt1Main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        
        HoaDon hoaDon = new HoaDon.HoaDonBuilder()
                            .setHeader(new HoaDonHeader("HD00001", formatDate.parse("12/5/1999"), "Nguyễn Thế Phong"))
                            .addDsCTDH(new CTHD("Áo sơ mi nam tay dài", 1, 150000, 10))
                            .addDsCTDH(new CTHD("Quần jeans nam phong cách", 2, 200000, 10))
                            .addDsCTDH(new CTHD("Áo thun nam mùa hè", 5, 600000, 10))
                            .addDsCTDH(new CTHD("Quần tây nam châu Âu", 1, 250000, 10))
                            .build();
        System.out.println(hoaDon.toString());
    }
    
}
