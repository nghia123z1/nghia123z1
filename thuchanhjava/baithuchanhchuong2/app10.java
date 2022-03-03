/ *
* Nhấp vào nbfs: //nbhost/SystemFileSystem/Templates/Licenses/license-default.txt để thay đổi giấy phép này
* Nhấp vào nbfs: //nbhost/SystemFileSystem/Templates/Classes/Main.java để chỉnh sửa mẫu này
 * /
 mã gói hàng ;

nhập  java.util.Scanner ;
 
 appbai10  công cộng {

    / **
     * @param cung cấp các đối số dòng lệnh
     * /
    public  static  void  main ( String [] args ) {
    Máy quét sc = Máy quét mới  ( Hệ thống . In);
       Chuỗi chuoi;
		char kitu;
		int dem = 0 ;
		làm 
		{
			Hệ thống . ra ngoài . println ( " enter to 1 string: " );
			chuoi = sc . hàng tiếp theo();
		}
		while (chuoi . length () > 80 );
		Hệ thống . ra ngoài . println ( " nhập vào 1 kí tự: " );
		kitu = sc . tiếp theo () . charAt ( 0 );
		char mang [] = chuoi . toCharArray ();
		for ( int i = 0 ; i < mang . length; i ++ )
		{
			if (mang [i] == kitu)
			{
				dem ++ ;
			}
		}
		Hệ thống . ra ngoài . println ( " have " + dem + " kí tự " + kitu + " trong vừa nhập chuỗi " );
		 // TODO mã ứng dụng logic tại đây
    }
    
}