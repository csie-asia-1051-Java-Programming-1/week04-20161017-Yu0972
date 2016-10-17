package ex;
import java.util.Scanner;

/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021045 郭毓呈
 */

public class ex02_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
	    while(true){
		System.out.println("輸入兩個正整數 n 與 m =");
		int n =scn.nextInt();
		int m=scn.nextInt();
		int a = n*m ;
		System.out.println( n + "x" + m + "=" + a );
    System.out.println("是否繼續?(y/n)");
    char b = scn.next().charAt(0);
    if( b == 'Y' || b == 'y' ){
    	continue;
    }else{
        if( b == 'N' || b == 'n' ){
        	System.out.println("結束");
    	break;
            }
         }
	  }
   }
}
