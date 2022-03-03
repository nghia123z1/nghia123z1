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
 appbai9 public class  {

    / **
     * @param cung cấp các đối số dòng lệnh
     * /
    public  static  void  main ( String [] args ) {
        Máy quét sc = Máy quét mới  ( Hệ thống . In);
        Hệ thống . ra ngoài . println ( " enter to 1 string " );
		Chuỗi chuoi = sc . hàng tiếp theo();
		int demso = 0 , demchuhoa = 0 , demchuthuong = 0 ;
		Hệ thống . ra ngoài . println ( " vừa nhập chuỗi là: " + chuoi);
		int dodai = chuoi . chiều dài();
		for ( int i = 0 ; i < dodai; i ++ )
			{
				if ( Character . isUpperCase (chuoi . charAt (i)))
				{
					demchuhoa ++ ;
				}
				if ( Character . isLowerCase (chuoi . charAt (i)))
				{
					demchuthuong ++ ;
				}
				if ( Character . isDigit (chuoi . charAt (i))) // ktra kí tự đó có con số k //
				{
					demso ++ ;
				}
			}
		int kitukhac = dodai - demchuhoa - demchuthuong - demso;
		Hệ thống . ra ngoài . println ( " có " + demchuhoa + " kí tự trong hoa " );
		Hệ thống . ra ngoài . println ( " có " + demchuthuong + " kí tự thường " );
		Hệ thống . ra ngoài . println ( " có " + demso + " kí tự số " );
		Hệ thống . ra ngoài . println ( " có " + kitukhac + " kí tự khác " ); // TODO mã ứng dụng logic tại đây
    }
    
}