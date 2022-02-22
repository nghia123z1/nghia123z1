gói  bt ;

nhập  java.util.Scanner ;

 lớp  công khai App10 {

	public  static  void  main ( String [] args ) {
		Máy quét sc = Máy quét mới  ( Hệ thống . In);
		Hệ thống . ra ngoài . println ( " nhập n: " );
		int n = sc . nextInt ();
		int dem = 0 ;
		sc . gần();
		trong khi (n > 0 )
		{
			dem ++ ;
			n = n / 10 ;
		}
		
		Hệ thống . ra ngoài . println ( " số vừa nhập có " + dem + " chữ số " );

	}

}