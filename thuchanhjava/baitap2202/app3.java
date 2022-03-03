gói  bt ;

nhập  java.util.Scanner ;

 lớp  công khai App3 {
	 kiểm tra boolean tĩnh  công cộng ( int n ) {  
		nếu (n < 2 )
		{
			trả về  sai ;
		}
		for ( int i = 2 ; i < n; i ++ )
		{
			nếu (n % i == 0 )
				trả về  sai ;
		}
		trả về  true ;
	}
	public  static  void  main ( String [] args ) {
		Máy quét sc = Máy quét mới  ( Hệ thống . In);
		int   n;
		làm
		{
			Hệ thống . ra ngoài . println ( " dương số nguyên: " );
			n = sc . nextInt ();
			
		}
		while (n <= 0 );
		sc . gần();
		nếu (kiểm tra (n))
		{
			Hệ thống . ra ngoài . println (n + " là SNT " );
		}
		khác
		{
			Hệ thống . ra ngoài . println (n + " ko là SNT " );
		}
	}

}