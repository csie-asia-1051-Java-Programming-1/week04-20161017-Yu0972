package hw;
import java.util.Scanner;

/*
 * Topic: ���ϥΪ̿�J1, 2, 3, �P4�ﶵ�A
 *1.��J n ����ܹϧ� (ex: n = 5)
 *2.��J n ����ܹϧ�
 *3.��J n (�����O�_��)����ܹϧ�
 *4.�����{��
 * Date: 2016/10/21
 * Author: 105021045 �����e
 */

public class hw04_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print( "��J�ﶵ 1 , 2 , 3 , 4 = " ) ;
		int a = scn.nextInt() ;
		if( a == 1 ) {
			System.out.print( "��J n (�_��)=" ) ;
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
		    System.out.print( "�п�Jn(�_��)=" ) ;
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
	        System.out.print( "�п�Jn(�_��)=" ) ;
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
			          System.out.print("����");
 }
		        }
	        }
        }
	}
}
