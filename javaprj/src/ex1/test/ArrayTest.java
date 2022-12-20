package ex1.test;

import java.util.Random;

public class ArrayTest {
	
	static int[] nums = {20,5,32,41,42,51,23,32,67,19};
	//함수 정의 
static void printNums(int []nums) {
	for(int i=0; i<10; i++) {
		System.out.printf("%d",nums [i]);
		if(i != 9)
		System.out.print(",");//nums 배열 출력하기
}
	
}
	public static void main(String[] args) {
		int[] ar1 = new int[5];
		
		// 랜덤값
		
int temp = 0;

//함수 호출
printNums (nums);



System.out.println();
//랜덤값 받기 전체
Random rand= new Random();
int a = rand.nextInt(10);
int d = rand.nextInt(10);
temp = nums [a];
nums [a] = nums[d];
nums [d] = temp;

printNums (nums);


//nums에서 [0]공간의 값과 [2]공간의 값을 바꾸기

		
		
		
//		ar1 = new int[7];
//		//2차원배열
//		int[][] ar2 = new int[3][5];
//		
//		ar2 = new int[2][6];
//		
//		ar2[0] = new int[9];
//		
//		//톱니형 배열 자바는 기본적으로 톱니형
//		
//		int[][] ar3 = new int[3][];
		
		
		
	}

}
