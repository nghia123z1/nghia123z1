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
 appbai3 public class  {
    private  static  Scanner a =  new  Scanner ( Hệ thống . in);
    / **
     * @param cung cấp các đối số dòng lệnh
     * /
    public  static  void  main ( String [] args ) {
        Hệ thống . ra ngoài . print ( " Nhap ten " );
        Chuỗi ten = a . hàng tiếp theo();
        Hệ thống . ra ngoài . print ( " Nhap nam   " );
        int nam = a . nextInt ();
            if ( 2022 - nam < 16 ) {
                Hệ thống . ra ngoài . println ( " Ban "  + ten +  " dang o do tuoi vi thanh nien " );
            }
            else  if ( 2022 - nam > = 16  &&  2022 - nam < 18 ) {
                Hệ thống . ra ngoài . println ( " Ban "  + ten +  " dang o do tuoi truong thanh " );
            }
            khác
                Hệ thống . ra ngoài . println ( " ban "  + ten +  " da gia " );
        
    }
    
}