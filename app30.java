nhập  java.util.Scanner ;

 ứng dụng lớp  công cộng {
 lớp  công khai App30 {
    public  static  void  main ( String [] args ) ném  Exception {
       Máy quét Scanner =  Máy quét mới  ( Hệ thống . In);
       int n, t =  0 , a;
       Hệ thống . ra ngoài . println ( " Nhap vao so nguyen n: " );
       n = máy quét . nextInt ();
       trong khi (n ! =  0 )
       {
           a = n %  10 ;
           n =   n /  10 ;
           t + = a;
       }
       Hệ thống . ra ngoài . println ( " Tong cac phan tu cua n la: "  + t);
    }
}