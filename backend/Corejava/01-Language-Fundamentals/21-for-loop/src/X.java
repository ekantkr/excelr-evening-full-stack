class X 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i <= 4; i++)
		{
			for(int j = 0; j <= 4; j++)
			{
		System.out.println(i + " :: " + j);
			}
		}
	}
}
/*
i = 0
j = 0,1,2,3,4,5
0::0
0::1
0::2
0::3
0::4
1::0  == (i = 0,1,2
1::1      j = 0,1,2,3,4,5
1::2
1::3
1::4
2::0
2::1
2::2
2::3
2::4  === (i = 0,1,2,3,4,5
*/
