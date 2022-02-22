gói  bt ;

nhập  java.util.Scanner ;

 lớp  công khai App6 {
	 kiểm tra boolean tĩnh  công khai ( int n )  
	{
		int sum = 0 ;
		for ( int i = 1 ; i < n; i ++ )
		{
			nếu (n % i == 0 )
			{
				tổng + = i;
			}
		}
		if (n == sum)
			trả về  true ;
		khác
			trả về  sai ;
	}
	public  static  void  main ( String [] args ) {
		Máy quét sc = Máy quét mới  ( Hệ thống . In);
		Hệ thống . ra ngoài . println ( " nhập sô: " );
		int n = sc . nextInt ();
		Hệ thống . ra ngoài . println ( " các hoàn thành nhỏ hơn " + n + " là: " );
		for ( int i = 1 ; i < n; i ++ )
		{
			nếu (kiểm tra (i))
			{
				Hệ thống . ra ngoài . print (i + "  " );
			}
		}
		
		
	}

}