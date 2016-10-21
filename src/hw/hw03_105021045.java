package hw;
import java.util.Scanner;

/*
Topic: 這個程式讓使用者連續輸入整數 (正數、負數及零)，直到使用者輸入 999 時停止，然後顯示正數有多少個，0 有幾個，負數總共有幾個，使用者可以重覆執行直到使用者輸入n。
* Date: 2016/10/21
* Author: 105021045 郭毓呈
*/

public class hw03_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner( System.in ) ;
	    while (true){
		System.out.print("輸入整數 (正數、負數及零)=") ;
		int a = 0 ;
		int b = 0 ;
		int c = 0 ;
		int d = 0 ;
		while ( true ) {
			    a = scn.nextInt() ;
				if( a > 0 && a != 999 ) {
					b ++ ;
		 }else{ if( a < 0 ) {
					c ++ ;
		 }else{ if( a == 0 ) {
					d ++ ;
		 }else{ if( a == 999 ){
			System.out.println( b + "個正數" ) ;
			System.out.println( c + "個負數" ) ;
			System.out.println( d + "個零" ) ;
		 }  
		    System.out.print("是否繼續?(y/n)=") ;  
		    char z = scn.next().charAt(0) ;
	        if( z == 'Y' || z == 'y' ) {
	    	continue ;
	 }else{
	        if( z == 'N' || z == 'n' ){
	        	System.out.println("結束");
	    	break;     
		                        }
		                    }
		                }
		            }
	            }
		    }
	    }
	}
}
