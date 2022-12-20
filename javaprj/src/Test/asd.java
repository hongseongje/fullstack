package Test;

import java.util.Scanner;

public class asd {

	
	public static void main(String[] args) {
           int [][] abc = new int [5][5];
           for(int i=0; i<5; i++) {
        	   for(int j=0; j<5;j++) {
        		   abc[i][j] = j+1;
        	   }
        						
			}
           for(int i=0; i<5; i++) {
        	   for(int j=0; j<5;j++) {
        		  System.out.println(abc[i][j]);
        	   }
//                                                              매개변수 없이도 객체 생성가능한 클래스가 있다  기능을 사용하고싶으면 객체이름.을사용        	   
        		   //객체생성문법 -> 클래스명 객체이름 (아무거나 다가능)= new 클래스명 ();                             //속성이나 함수에 접근할때 .을 사용한다           
	}
           //클래스는 함수의 정의를 포함하고있는 페이지
           int []ab = new int [5];
           for(int i = 0; i<5; i++) {
        	  Scanner scan = new Scanner(System.in);
        	 
        	  int num = scan.nextInt();
        	  ab[i] = num;
           }
        	for(int i = 0; i<5; i++) {
        		System.out.println(ab[i]);
        	}
        	int []q = new int [16];
        	
        			for(int i =0; i<16; i++) {
        				q[i] = i+1;
        				
        			}
        			{for(int i =0; i<16; i++)
        				System.out.println(q[i]);
        			}
        asd2 a 	= new asd2();
        //속성이나 함수에 접근할때 .을 사용한다
	}
}
