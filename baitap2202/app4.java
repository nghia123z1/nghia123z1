gói  bt ;

nhập  java.util.Scanner ;

 lớp  công khai App4 {

	 kiểm tra boolean tĩnh  công khai ( int n )  
	{
		nếu (n < 2 )
		{
			trả về  sai ;
		}
		for ( int i = 2 ; i <=  Math . sqrt (n); i ++ )
		{
			nếu (n % i == 0 )
				trả về  sai ;			
		}
		trả về  true ;
			
	}
	public  static  void  main ( String [] args ) {
	Máy quét sc = Máy quét mới  ( Hệ thống . In);
	Hệ thống . ra ngoài . println ( " nhap n:   " );
	int n = sc . nextInt ();
	Hệ thống . ra ngoài . println ( " cac so nguyen to nho hon " + n + " la: "  + 2 );
	sc . gần();
	for ( int i = 3 ; i < n; i + = 2 ) // các chẵn lẻ phải là số n.tố
	{
		nếu (kiểm tra (i))
		{
			Hệ thống . ra ngoài . print (i + "  " );
		}
	}
	
}
}