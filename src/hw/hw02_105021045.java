package hw;
import java.util.Scanner;

/*
Topic: �ϥΪ̿�J����� n �P m �M��p��C n��m
* Date: 2016/10/21
* Author: 105021045 �����e
*/

public class hw02_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner( System.in ) ;
		System.out.print( "��J����� n =" ) ;
		int n = scn.nextInt() ;
		System.out.print( "��J����� m =" ) ;
		int m = scn.nextInt() ;
		int a  = 1 ;
		int b = 1 ;
		for ( int i = m + 1 ; i <= n ; i ++ ){
	     	a *= i ;
	    }
		for ( int i = 1 ; i <= n - m ; i ++ ){
			b *= i ;
		}
		System.out.print( "C" + n + "��" + m + "=" ) ;
		System.out.println( a / b );
	}
}
