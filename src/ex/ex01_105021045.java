package ex;
import java.util.Scanner;

/*
 * Topic: 寫一個程式讓使用者輸入多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021045 郭毓呈
 */

public class ex01_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入多個正整數(包含0)=");
		int a = scn.nextInt() ;
		int b = 0 ;
		int c = 0 ;
		while ( a != -1 ){
			c = c + a ;
			b = b + 1 ;
		    a = scn.nextInt();
		}
		System.out.println( "這些數字的總合=" + c );
		System.out.println( "這些數字的平均=" + c / b );
	}
}
