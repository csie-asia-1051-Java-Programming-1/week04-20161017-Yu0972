package hw;
import java.util.Scanner;

/*
Topic: �o�ӵ{�����ϥΪ̳s���J��� (���ơB�t�Ƥιs)�A����ϥΪ̿�J 999 �ɰ���A�M����ܥ��Ʀ��h�֭ӡA0 ���X�ӡA�t���`�@���X�ӡA�ϥΪ̥i�H���а��檽��ϥΪ̿�Jn�C
* Date: 2016/10/21
* Author: 105021045 �����e
*/

public class hw03_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner( System.in ) ;
	    while (true){
		System.out.print("��J��� (���ơB�t�Ƥιs)=") ;
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
			System.out.println( b + "�ӥ���" ) ;
			System.out.println( c + "�ӭt��" ) ;
			System.out.println( d + "�ӹs" ) ;
		 }  
		    System.out.print("�O�_�~��?(y/n)=") ;  
		    char z = scn.next().charAt(0) ;
	        if( z == 'Y' || z == 'y' ) {
	    	continue ;
	 }else{
	        if( z == 'N' || z == 'n' ){
	        	System.out.println("����");
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
