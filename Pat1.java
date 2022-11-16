/*Pattern 1:
package com.javainterviewpoint;*/

public class Pat1
{
    public static void main(String[] args)
    {
	int rows = 5;
        System.out.println("## Printing the pattern ##");
        for (int i = 1; i <= rows; i++)                                                                              //for (int i = rows; i >= 1; i--)

        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");           //System.out.print( "*");    //  System.out.print(i+ " ");                              

            }
            System.out.println();
        }
    }
}
/*Output
//
## Printing the pattern ##         
1                                            *                               1                                         12345      
1 2                                          **                              22                                        1234 
1 2 3                                        ***                             333                                       123
1 2 3 4                                      ****                            4444                                      12
1 2 3 4 5                                    *****                           55555                                     1 
*/



package com.javainterviewpoint;

public class Pattern2
{
    public static void main(String[] args)
    {
	int alphabet = 65;
	int rows = 5;
        System.out.println("## Printing the pattern ##");
        for (int i = 1; i <= rows; i++)                                       //for (int i = rows; i >= 1; i--)
                                            //for (int i = rows; i >= 1; i--)
                                  
        {
            for (int j = 1; j <= i; j++) //OR  for (int j = rows; j >= i; j--)                                 

            {
                System.out.print((char)(alphabet + j -1) + " ");    //System.out.print((char)(alphabet + i-1) + " ");

            }
            System.out.println();
        }
    }
}


## Printing the pattern ##
A                  OR E D C B A                                       A       // E                                                 A B C D E                                                                     
A B                   E D C B                                        BB          E D                                               A B C D   
A B C                 E D C                                         CCC          E D C                                             A B C 
A B C D               E D C                                        DDDD          E D C B                                           A B
A B C D E             E D                                         EEEEE          E D C B A                                         A   
                      E

public class Pat2
{
	public static void main(String[] args)
	{
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++)                                                             // 		for (int i = rows; i >=1;i--)

                { 
                        for (int j = rows; j > i; j--)                                                  
			{
				System.out.print("  ");                                                                            5
			}                                                                                                     4 5
                                                                                                                 3  4  5
			for (int k = 1; k <= i; k++)                                                                        2  3  4  5
			{                                                                                                 1  2  3  4  5
				System.out.print("* ");     // 				System.out.print(k + " ");

			}
			System.out.println();
		}
	}
}


## Printing the pattern ##                                         1
        *                                                         1 2
      * *                                                         1 2 3
    * * *                                                        1 2 3 4
  * * * *                                                       1 2 3 4 5
* * * * *



public class Pat2
{
	public static void main(String[] args)
	{
		int alphabet = 65;
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++) 
                { 
                        for (int j = rows; j >= i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print((char) (alphabet + k - 1) + " ");
			}
			System.out.println();
		}
	}
}

o/p->

  
    A B 
   A B C 
  A B C D 
 A B C D E  
 
 
public class Pat2
{
	public static void main(String[] args)
	{
		int alphabet = 65;
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = rows; i >= 1; i--)
		{
			for (int j = 1; j <= i; j++)  
			{
				System.out.print(" ");
			}
			for (int k = i; k <= 5; k++)
			{
				System.out.print((char) (alphabet + k - 1) + " ");
			}
			System.out.println();
		}
	}
}

o/p-

     E
    D E
   C D E
  B C D E
 A B C D E



 

public class Pat2
{
	public static void main(String[] args)
	{
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++) 
                { 
                        for (int j = rows; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++)              //  			for (int k = 1; k <= i; k++)

			{
				System.out.print("*");                           //     				System.out.print(i + " ");
      
			}
			System.out.println();
		}
	}
}


o/p->

            *                                                                                  1 
		   * *                                                                                2  2 
		  * * *                                                                              3  3  3
         * * * *                                                                            4  4  4  4
        * * * * * 		                                                                   5  5 5  5  5



public class Pat2
{
	public static void main(String[] args)
	{
		int alphabet = 65;
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++) 
                { 
                        for (int j = rows; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print((char) (alphabet + i - 1) + " ");
			}
			System.out.println();
		}
	}
}

o/p-

## Printing the pattern ##
    A
   B B
  C C C
 D D D D
E E E E E



public class Pat2
{
	public static void main(String[] args)
	{
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++)                        // 		for (int i = rows; i >= 1; i--)

                {
                        for (int j = rows; j >= i; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

o/p-

## Printing the pattern ##                                                 
5 4 3 2 1                                                                5                                                              
5 4 3 2                                                                  5 4
5 4 3                                                                    5 4 3
5 4                                                                      5 4 3 2 
5                                                                        5 4 3 2 1  


public class Pattern17
{
	public static void main(String[] args)
	{
		int rows = 5;
		int temp = 1;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(temp + " ");
				temp++;
			}
			System.out.println();
		}
	}
}


o/p-

## Printing the pattern ##
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15



public class Pat21
{
	public static void main(String[] args)
	{
		int alphabet = 65;
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print((char) (alphabet) + " ");
				alphabet++;
			}
			System.out.println();
		}
	}
}

o/p-

A 
B C 
D E F 
G H I J 
K L M N O


public class Pattern22
{
	public static void main(String[] args)
	{
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++) 
               { 
                        for (int j = rows; j > i; j--)
			{
				System.out.print(" ");
			}
			int temp = 1;
			for (int k = 1; k <= i; k++)
			{
				System.out.print(temp + " ");
				temp = temp * (i - k) / (k);
			}
			System.out.println();
		}
	}
}
o/p-

    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 


public class Pattern23
{
	public static void main(String[] args)
	{
		int alphabet = 65;
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++) 
                { 
                        for (int j = rows; j > i; j--)
			{
				System.out.print(" ");
			}
			int temp = 1;
			for (int k = 1; k <= i; k++)
			{
				System.out.print((char) (alphabet - 1 + temp) + " ");
				temp = temp * (i - k) / (k);
			}
			System.out.println();
		}
	}
}

o/p-

    A 
   A A 
  A B A 
 A C C A 
A D F D A


public class Pattern24
{
	public static void main(String[] args)
	{
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j <= i; j++) 
                       { 
                               System.out.print(j + " "); 
                       } 
                       System.out.println(); 
                }
                for (int i = rows; i >= 1; i--)
		{
			for (int j = 1; j < i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}


public class Pattern24
{
	public static void main(String[] args)
	{
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j <= i; j++) 
                       { 
                               System.out.print(j + " "); 
                       } 
                       System.out.println(); 
                }
                for (int i = rows; i >= 1; i--)
		{
			for (int j = 1; j < i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

o/p-

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1



public class Pattern25
{
	public static void main(String[] args)
	{
		int alphabet = 65;
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j <= i; j++) 
                        { 
                                System.out.print((char) (alphabet + j - 1) + " "); 
                        } 
                        System.out.println(); 
                } 
                for (int i = rows; i >= 1; i--)
		{
			for (int j = 1; j <= i - 1; j++)
			{
				System.out.print((char) (alphabet + j - 1) + " ");
			}
			System.out.println();
		}
	}
}

o/p-

A 
A B 
A B C 
A B C D 
A B C D E 
A B C D 
A B C 
A B 
A


public class Pattern26
{
	public static void main(String[] args)
	{
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= rows - 1; i++) 
                {
                        for (int j = rows - 1; j >= i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

o/p-

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * *  
* *   
*


public class Pattern27
{
	public static void main(String[] args)
	{
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++) 
                {
                        for (int j = rows; j > i; j--)
			{
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 1; i <= rows - 1; i++)
		{
			for (int j = 1; j <= i; j++) 
                        { 
                                System.out.print(" "); 
                        } 
                        for (int k = rows - 1; k >= i; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}


o/p-

  * 
      * * 
    * * * 
  * * * * 
* * * * * 
  * * * * 
    * * * 
      * * 
        *
		
		
		
public class Pattern28
{
	public static void main(String[] args)
	{
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = rows; i >= 1; i--)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = 2; i <= rows; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}


o/p-

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5



public class Pattern29
{
	public static void main(String[] args)
	{
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = rows; i >= 1; i--)
		{
			for (int j = i; j >= 1; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = 2; i <= rows; i++) 
                { 
                        for (int j = i; j >= 1; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
op

## Printing the pattern ##
5 4 3 2 1 
4 3 2 1 
3 2 1 
2 1 
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1		