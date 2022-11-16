/*
import java.lang.*;
import java.util.*;

class P17{
	
	public static void main(String args[]){
		
		for(int i = 1; i < 5; i++){
			
			for(int j = 1; j <= i; j++){
				
				System.out.print(" * ");
			}
			
			System.out.println();
		}
		
		for(int i = 1; i <= 5; i++){
			
			for(int j = i; j <= 5; j++){
				
				System.out.print(" * ");
			}
			
			System.out.println();
		}
	}
}


O/p->

 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 *

*/

------------------------------------------------

import java.lang.*;
import java.util.*;

class p16{
	
  public static void main(String[] args){
	  
    int h = 5;
    int w = 5;
	
    int space = w*5;
	
    int x = 1;
	
    for(int a = 1; a <= h; a++){
		
      for(int i = x; i <= w; i++){
		  
        for(int j = space; j >= i; j--){
			
          System.out.print(" ");
		  
        }
		
        for(int k = 1; k <= i; k++){
			
          System.out.print("* ");
		  
        }
		
        System.out.println();
		
      }
	  
      x = x+2;
	  
      w = w+2;
	  
    }
	
    for(int i = 1; i <= 4; i++){
		
      for(int j = space-3; j >= 1; j--){
        
        System.out.print(" ");
      }
	  
      for(int k= 1; k <= 4; k++){
		  
        System.out.print("* ");
		
      }
	  
      System.out.println();
    }
  }
}

/*
----------------------------------


import java.lang.*;
import java.util.*;

class p15{
	
	public static void main(String args[]){
		
		for(int i = 1; i <= 6; i++){
			
			for(int j = 1; j <= i; j++){
				
				System.out.print("   ");
			}
			
			for(int j = i; j <= 6; j++){
				
				System.out.print("  "+j+" ");
			}
			
			System.out.println();
		}
		
	}
}	
--------------------------------------------------

import java.lang.*;
import java.util.*;

class p13{
	
	public static void main(String args[]){
		
		int alpha = 65;
		for(int i = 1; i < 6; i++){
			
			for(int j = i; j <= 6; j++){
				
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++){
				
				if(j == i || j == 1){
				
					System.out.print((char)alpha+" ");
				}
				
				else{
					
					System.out.print("  ");
				}
				
			}
			alpha++;
			System.out.println();
		}
		
		int bet = 70;
		
		for(int i = 1; i <= 6; i++){
			
			for(int j = 1; j <= i; j++){
				
				System.out.print(" ");
			}
			
			for(int j = i; j <= 6; j++){
				
				if( j == i || j == 6 ){
					
					System.out.print((char)bet+" ");
				}
				
				else{
					
					System.out.print("  ");
				}
			}
			bet--;
			System.out.println();
		}
	}
}

------------------------------------------------------

import java.lang.*;
import java.util.*;

class p12{
	
	public static void main(String args[]){
		
		for(int i = 1; i<= 6; i++){
			
			for(int j = i; j <= 6; j++){
				
				System.out.print(" ");
			}
			
			int alpha = 65;
			
			for(int j = 1; j <= i; j++){
				
				System.out.print((char)alpha+" ");
				alpha++;
			}
			
			System.out.println();
		}
	}
}

------------------------------------------------


import java.lang.*;
import java.util.*;

class p11{
	
	public static void main(String args[]){
		
		
		for(int i = 1; i <= 6; i++){
			
			int alpha = 65;
			for(int j = i; j <= 6; j++){
			
				System.out.print((char)alpha+" ");
				alpha++;
			}
			
			System.out.println();
		}
		
		for(int i = 1; i <= 6; i++){
			
			int alpha = 65;
			
			for(int j = 1; j <= i; j++){
				
				System.out.print((char)alpha+" ");
				alpha++;
			}
			System.out.println();
		}
	}
}

--------------------------

import java.lang.*;
import java.util.*;

class p10{
	
	public static void main(String args[]){
		
		int alpha = 65;
		for(int i = 1; i <= 6; i++){
			
			for(int j = 1; j <= i; j++){
				
				System.out.print((char)alpha+" ");
			}
			
			System.out.println();
			alpha++;
			
		}
	}
}

------------------------------------------

import java.lang.*;
import java.util.*;

class p1{
	
	public static void main(String args[]){
		
		int i;
		int j;
		
		for(i = 1; i <= 5; i++){
			
			for(j = i; j <= 5; j++){
				
				System.out.print(" ");
				
			}
			
			for(j = 1; j <= 9; j++){
					
				if( j == i || i == 5 || j == 1 ){
					
					System.out.print(" * ");
				
				}
				else{
					
					System.out.print("   ");
				}
				
			}
			
			System.out.println();
		}
	}
}

----------------------------------------------	
*/