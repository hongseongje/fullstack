package ex1.test;

public class OmokTest3 {

	public static void main(String[] args) {
	
		char [] board= new char[100]; //문자 100개를 담을 배열 만들기
		for(int i=0; i<100;i++)
			board[i]='┼';
			
		for(int i=1; i<=10;i++) {		
			for(int j=1;j<=10;j++) {
			
				System.out.print(board[i]);
				if(j==10)
					System.out.println();
			}
		}
	}

}
