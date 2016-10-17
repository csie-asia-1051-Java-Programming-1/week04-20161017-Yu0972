package ex;
import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一個正整數 n 然後顯示出下列圖形 (例 n = 4)
	* 
	** 
	***
	****
 * Date: 2016/10/17
 * Author: 105021045 郭毓呈
 */

public class ex03_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入一個正整數 n = ");
		int n = scn.nextInt();
		for( int a = 0 ; a < n ; a ++ ){
		for( int b = 0 ; b <= a ; b ++ ){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
