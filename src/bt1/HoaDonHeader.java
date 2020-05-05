/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Hai Tran Do
 */
public class HoaDonHeader {
    String maHoaDon;
    Date ngayBan;
    String tenKH;

    public HoaDonHeader(String maHoaDon, Date ngayBan, String tenKH) {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "Thông tin chung: " + "Mã hóa đơn: " + maHoaDon
               + ", ngày bán: " + new SimpleDateFormat("dd/MM/yyy").format(ngayBan)
               + ", tên KH: " + tenKH;
    }
    
}
