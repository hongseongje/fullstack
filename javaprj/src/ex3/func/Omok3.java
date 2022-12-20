package ex3.func;

import java.util.Scanner;

public class Omok3 {
	static void initBoard(char[][] board) {
		for (int y = 1; y <= 10; y++)
			for (int x = 1; x <= 10; x++)

				board[y - 1][x - 1] = '┼';

		// 마감
		for (int i = 0; i < 10; i++) {
			// 위 앞 옆 아래
			board[0][i] = '┬';
			board[i][0] = '├';
			board[i][9] = '┤';
			board[9][i] = '┴';
			// 모서리
			board[0][0] = '┌';
			board[9][9] = '┘';
			board[0][9] = '┐';
			board[9][0] = '└';
		}
	}

	static void printBoard(char[][] board) {
		for (int y = 1; y <= 10; y++) {
			for (int x = 1; x <= 10; x++)
				System.out.printf("%c", board[y - 1][x - 1]);
			System.out.println();
		}

	}

	

	public static void main(String[] args) {
//		char[] board = new char[100];
//		문자값 선언 char
		char[][] board = new char[10][10];
		initBoard(board);
		printBoard(board);
		
		// board[i] = '┼';

		// 오른쪽이 엑스좌표 또도도도도 와이좌표 세로
//       board[(5-1)*10+(9-1)] ='○';
//		--------------------------------------------------------
		// 사용자로부터 다음 모양의 입력을 요청한다.
		// (x.y)>3 3 => nextInt(),nextInt()
		// 사용자 입력받기위한 스캐너
//                좌표 입력받는 코드   사용자입력시 system.in
		Scanner scan = new Scanner(System.in);
		// 백돌
		boolean order = true;
		
		while (true) {
			//intputOmokBoard(board);
			

			// board[ay - 1][ax - 1] = '●';
// 흑돌
//		int ax, ay;
//		System.out.println("x좌표입력");
//			ax = scan.nextInt();
//			System.out.println("y좌표입력");
//			ay = scan.nextInt();
//			board[ay - 1][ax - 1] = '●';
			// 바둑판 출력

		}

//-----------------------------------------------------------		
//		for (int j = 0; j < 10; j++) {
//			System.out.printf("%c", board[j]);
//			if (j % 10 == 9)
//				System.out.print("\n");
//			for (int k = 0; k < 10; k++)
//			System.out.printf("%c", board[k]);
//			if (k % 10 == 9)
//				System.out.print("\n");
//		}

	}

	static void intputOmokBoard(boolean order, char[][] board) {
		int ox, oy;
		Scanner scan = new Scanner(System.in);
		// 백돌
		 order = true;
		if (order) {
			System.out.println("x좌표입력");
			ox = scan.nextInt();
			System.out.println("y좌표입력");
			oy = scan.nextInt();
			board[oy - 1][ox - 1] = '○';
			order = false;
		} else {
			System.out.println("x좌표입력");
			ox = scan.nextInt();
			System.out.println("y좌표입력");
			oy = scan.nextInt();
			board[oy - 1][ox - 1] = '●';
			order = true;
		}
		
	}

}


