package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 105021045 郭毓呈
 */

import java.util.Scanner;

public class ex04_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print( "輸入一個正整數 n = " ) ;
		int n = scn.nextInt() ;
		System.out.print( "輸入一個字元符號 = " ) ;
		char a=scn.next().charAt(0);
		for ( int b = 0 ; b < n ; b ++ ){
		for ( int c = n ; c > b ; c -- ){
				System.out.print(a) ;
			}
			System.out.println("") ;
	    }
	}
}
