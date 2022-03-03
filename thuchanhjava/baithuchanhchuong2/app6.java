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
 appbai6 public class  {
     private  static  Scanner a =  new  Scanner ( Hệ thống . in);
    / **
     * @param cung cấp các đối số dòng lệnh
     * /
    public  static  void  main ( String [] args ) {
       	int n, giaithua = 1 ;
		làm {
			Hệ thống . ra ngoài . println ( " enter to 1 positive integer: " );
			n = a . nextInt ();
		}
		while (n <= 0 );
		for ( int i = 1 ; i <= n; i ++ )
		{
			giaithua = giaithua * i;
		}
		Hệ thống . ra ngoài . println ( " giai thừa số vừa nhập là: " + giaithua);
		 // TODO mã ứng dụng logic tại đây
    }
    
}