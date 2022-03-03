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
 appbai8 public class  {
  
    / **
     * @param cung cấp các đối số dòng lệnh
     * /
    public  static  void  main ( String [] args ) {
        Scanner a =  new  Scanner ( Hệ thống . In);
        Hệ thống . ra ngoài . print ( " input n: " );
		int n = a . nextInt ();
		int arr [] = new  int [n];
		tổng kép = 0 ;
		for ( int i = 0 ; i < n; i ++ )
		{
			Hệ thống . ra ngoài . print ( " input number " + (i + 1 ) + " : " );
			arr [i] = a . nextInt ();
		}
		for ( int i = 0 ; i < n; i ++ )
		{
			sum = sum + arr [i];
		}
		Hệ thống . ra ngoài . println ( " trung bình cộng là: " + (sum / n));
	
    }
}