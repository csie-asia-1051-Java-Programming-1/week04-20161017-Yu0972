package hw;
import java.util.Scanner;

/*
 * Topic: �ϥΪ̿�J n ���� n �� �O��ƦC (�� n = 5 )
	1, 1, 2, 3, 5
 * Date: 2016/10/21
 * Author: 105021045 �����e
 */

public class hw01_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner( System.in ) ;
		System.out.print( "��J n =" ) ;
		int n = scn.nextInt() ;
		int a = 1 ;
		int b = 2 ;
		int c = 0 ;
		System.out.print( " n �ӶO��ƦC =" ) ;
 		if( n == 1 ) {
		System.out.print( 1 ) ;
 }else{ if( n == 2 ) {
		System.out.print( 1 + "," + 1 ) ;
 }else{ if( n == 3 ) {
		System.out.print( 1 + "," + 1 + "," + 2 ) ;
 }else{ if( n >= 4 ) {
		System.out.print( 1 + "," + 1 + "," + 2 + "," + 3 + "," ) ;
 }	
		for( int d = 1 ; d <= n - 4 ; d ++ ) {
			c = a + b ;
			a = b ;
			b = c ;
			c = a + b ;
			System.out.print( c + "," ) ;
		            }
	            }
            }
        }
    }
}
