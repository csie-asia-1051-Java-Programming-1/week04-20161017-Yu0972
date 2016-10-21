package hw;
import java.util.Scanner;

/*
 * Topic: 讓使用者輸入1, 2, 3, 與4選項，
 *1.輸入 n 並顯示圖形 (ex: n = 5)
 *2.輸入 n 並顯示圖形
 *3.輸入 n (必須是奇數)並顯示圖形
 *4.結束程式
 * Date: 2016/10/21
 * Author: 105021045 郭毓呈
 */

public class hw04_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print( "輸入選項 1 , 2 , 3 , 4 = " ) ;
		int a = scn.nextInt() ;
		if( a == 1 ) {
			System.out.print( "輸入 n (奇數)=" ) ;
			int n = scn.nextInt() ;
			    for( int b = n - 2 ; b > 0 ; b -- ) {
				for( int c = b ; c > 0 ; c -- ) {
					System.out.print( "@" ) ;
					}
				    System.out.println( "" ) ;
				    }
			    for( int b = 2 ; b < n - 1 ; b ++ ) {
				for( int c = 0 ; c < b ; c ++ ) {
				    System.out.print( "@" );
				    }
					System.out.println( "" );
					}
 }else{ if( a == 2 ) {
		    System.out.print( "請輸入n(奇數)=" ) ;
			int n = scn.nextInt() ;
			    for( int b = 2 ; b < n - 1 ; b ++ ) {
			    for( int c = 1 ; c < b ; c ++ ) {
				    System.out.print( "@" );
				    }
				    System.out.println( "" );
				    }
			    for( int b = n - 2 ; b > 0 ; b -- ) {
			    for( int c = b ; c > 0 ; c -- ) {
					System.out.print( "@" );
					}
				    System.out.println( "" );
				    }
 }else{ if( a == 3 ){
	        System.out.print( "請輸入n(奇數)=" ) ;
			int n = scn.nextInt();		
				for( int b = 1 ; b <= ( n / 2 ) ; b ++ ) {
				for( int c = n - 2 ; c > b ; c -- ) {
				    System.out.print( " " );
				    }
				for( int e = 1 ; e < b * 2 ; e ++ ) {
				        System.out.print( "*" );
				        }
				        System.out.println();
				        }
				for( int b = ( n / 2 ) ; b > 0 ; b -- ) {
				for( int c =  n - 1 ; c > b ; c -- ) {
				        System.out.print(" ");}
				for( int e = 1 ; e < ( b * 2 ) ; e ++ ) {
				        System.out.print("*");
				        }
				        System.out.println();
				        }
 }else{ if( a == 4 ){
			          System.out.print("結束");
 }
		        }
	        }
        }
	}
}
