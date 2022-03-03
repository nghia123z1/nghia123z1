gói  bt ;

nhập  java.util.Scanner ;

 lớp  công khai App2 {
	public  static  void  check ( float  a , float  b , float  c )
	{
		nếu (a == b && a == c)
		{
			Hệ thống . ra ngoài . println ( " đây là tam giác đều " );
		}
		khác 
		{
			nếu (a == b || a == c || b == c)
			{
				if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)
				{
					Hệ thống . ra ngoài . println ( " đây là tam giác vuông cân " );
				}
				khác
				{
					Hệ thống . ra ngoài . println ( " đây là tam giác cân " );
				}
			}
			khác
			{
				if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)
				{
					Hệ thống . ra ngoài . println ( " đây là tam giác vuông " );
				}
				khác
				{
					Hệ thống . ra ngoài . println ( " đây là tam giác thường " );
				}
			}
			
		}		
	}
	public  static  void  main ( String [] args ) {
		
		Máy quét sc = Máy quét mới  ( Hệ thống . In);
		Hệ thống . ra ngoài . println ( " nhập cạnh thứ nhất " );
		float a = sc . nextFloat ();
		Hệ thống . ra ngoài . println ( " nhập cạnh thứ 2 " );
		float b = sc . nextFloat ();
		Hệ thống . ra ngoài . println ( " nhập cạnh thứ 3 " );
		float   c = sc . nextFloat ();
		sc . gần();
		kiểm tra (a, b, c);
		
		

	}

}