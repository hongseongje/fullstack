package ex1.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;

public class ArrayTest2Sort {

	public static void main(String[] args) throws FileNotFoundException {
//		int[] ar1 = new int[5];
//
//		// 랜덤값
//		Random rand = new Random();
//		int a = rand.nextInt(10);
//		int d = rand.nextInt(10);
//		int temp = 0;
	int[] nums = { 20, 5, 32, 41, 42, 51, 23, 32, 67, 19 };
////nums 배열 출력하기
//		for (int i = 0; i < 10; i++) {
//			System.out.printf("%d", nums[i]);
//			if (i != 9)
//				System.out.print(",");
//		}
//		System.out.println();
//
//		temp = nums[a];
//		nums[a] = nums[d];
//		nums[d] = temp;
//// shuffle 한 데이터 저장

//		FileOutputStream fos = new FileOutputStream("res/data-out.txt");
//		PrintStream out = new PrintStream(fos);

		for (int i = 0; i < 10; i++) {
			System.out.printf("%d", nums[i]);
			if (i != 9)
				System.out.print(",");
		}

		System.out.println("저장완료");
// sort 하기

		{
			// 제일 큰 번호를 제일 끝으로 옮기기
			for(int j = 0; j<10-1; j++)
			for (int i = 0; i < 10 - 1 - j; i++) {
				if (nums[i] > nums[i + 1]) {
					int temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;

				}

			}
		}
//화면에 출력하기
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d ", nums[i]);
		}

	}
}
