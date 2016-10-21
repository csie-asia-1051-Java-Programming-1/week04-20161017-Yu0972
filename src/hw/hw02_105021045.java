package hw;
import java.util.Scanner;

/*
Topic: 使用者輸入正整數 n 與 m 然後計算C n取m
* Date: 2016/10/21
* Author: 105021045 郭毓呈
*/

public class hw02_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner( System.in ) ;
		System.out.print( "輸入正整數 n =" ) ;
		int n = scn.nextInt() ;
		System.out.print( "輸入正整數 m =" ) ;
		int m = scn.nextInt() ;
		int a  = 1 ;
		int b = 1 ;
		for ( int i = m + 1 ; i <= n ; i ++ ){
	     	a *= i ;
	    }
		for ( int i = 1 ; i <= n - m ; i ++ ){
			b *= i ;
		}
		System.out.print( "C" + n + "取" + m + "=" ) ;
		System.out.println( a / b );
	}
}
