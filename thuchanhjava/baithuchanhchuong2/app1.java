/ *
* Nhấp vào nbfs: //nbhost/SystemFileSystem/Templates/Licenses/license-default.txt để thay đổi giấy phép này
* Nhấp vào nbfs: //nbhost/SystemFileSystem/Templates/Classes/Main.java để chỉnh sửa mẫu này
 * /
 mã gói hàng ;
nhập  java.util.Scanner ;
/ **
*
* Quản trị viên @author
 * /
 appbai1 public class  {
     máy quét Scanner tĩnh  riêng = Máy quét mới ( Hệ thống . in);  
    / **
     * @param cung cấp các đối số dòng lệnh
     * /
    public  static  void  main ( String [] args ) {
      Hệ thống . ra ngoài . print ( " enter to 1 number positive a: " );
         float a = máy quét . nextFloat ();
      Hệ thống . ra ngoài . print ( " enter to 1 number positive b: " );
         float b = máy quét . nextFloat ();
        float tong = a + b;
        float hieu;
            nếu (a > b)
                hieu = a - b;
            khác
                hieu = b - a;
        nổi tich; float   ms, ts;
            ts = a;
            ms = b;
           nếu (mili giây == 0 ) {
               Hệ thống . ra ngoài . print ( " not a allowable feature " );
           }
           khác {
               tich = ts / ms;
               Hệ thống . ra ngoài . println ( " tích của 2 số là: "  + tich);
           }
           float thuong;
            thuong = a * b;
          
       Hệ thống . ra ngoài . println ( " tổng của 2 số là: "  + tong);
       Hệ thống . ra ngoài . println ( " Hiệu của 2 số là: "  + hieu);
       Hệ thống . ra ngoài . println ( " thuong of 2 number is: "  + thuong);
       
         
    }
    
}