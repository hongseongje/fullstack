package ex3.func;

public class BasicFunction {
	static int f1(int x) {
		return 3 + x * 23;
	}

	static int add(int a, int b) {
		return a + b;
	}
	//반환값 없는 함수 void가 붙으면 return이 없다 
static void printSum(int sum) {
	
	System.out.println(sum);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 3 + 4 * 23 - 23 + 345 - 23;

		System.out.printf("result is %d\n", result);
int a = add(3,4);
System.out.println(a);
		result = f1(5) - 23 + 345 - 23 + add(5,9);

		System.out.printf("result is %d\n", result);

		printSum(add( 4,5));
		
		printSum(add( 4,5));
	
	
	}
}
