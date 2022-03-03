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
 lớp  công cộng appbai11 {

    / **
     * @param cung cấp các đối số dòng lệnh
     * /
    public  static  void  main ( String [] args ) {
        Máy quét sc = Máy quét mới  ( Hệ thống . In);
          int n, temp, max =  100 ;
        int  A [] =  new  int [max];
        làm {
            Hệ thống . ra ngoài . println ( " Import number of array: " );
            n = sc . nextInt ();
        } while (n <=  2  || n > max - 1 );
        Hệ thống . ra ngoài . println ( " Nhập giá trị cho các mảng của phần tử: " );
        for ( int i =  0 ; i < n; i ++ ) {
            Hệ thống . ra ngoài . print ( " A [ "  + i +  " ] = " );
            A [i] = sc . nextInt ();
        }
        Hệ thống . ra ngoài . println ( " Mảng ban đầu: " );
        for ( int i =  0 ; i < n; i ++ ) {
            Hệ thống . ra ngoài . print ( A [i] +  " \ t " );
        }
        for ( int i =  0 ; i < n -  1 ; i ++ ) {
            for ( int j = i + 1 ; j <= n -  1 ; j ++ ) {
                nếu ( A [j] <  A [i]) {
                    temp =  A [i];
                    A [i] =  A [j];
                    A [j] = tạm thời;
                }
            }
        }
        Hệ thống . ra ngoài . println ( " \ n Mảng sau khi sắp xếp: " );
        for ( int i =  0 ; i < n; i ++ ) {
            Hệ thống . ra ngoài . print ( A [i] +  " \ t " );
        }
       

    }
    
}